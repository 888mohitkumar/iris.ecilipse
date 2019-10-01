package com.iris.messanger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.iris.messanger.database.DatabaseClass;
import com.iris.messanger.model.Message;
import com.iris.messanger.model.Profile;

public class MessageService {

	private final Map<Long, Message> messages = DatabaseClass.getMessages();
	private final Map<Long, Profile> profiles = DatabaseClass.getProfiles();

	public Message addMessage(final Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public List<Message> getAllMessagesForYear(final int year) {
		final List<Message> messageForyear = new ArrayList();
		final Calendar cal = Calendar.getInstance();
		for (final Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if (cal.get(Calendar.YEAR) == year) {
				messageForyear.add(message);
			}
		}
		return messageForyear;
	}

	public List<Message> getAllMessagesPagenated(final int start, final int end) {
		final ArrayList<Message> list = new ArrayList(messages.values());

		return list.subList(start, start + end);
	}

	public Message getMessage(final long id) {
		return messages.get(id);
	}

	public List<Message> getMessages() {
		return new ArrayList<>(messages.values());
	}

	public Message removeMessage(final long id) {
		return messages.remove(id);
	}

	public Message updateMessage(final Message message) {
		messages.put(message.getId(), message);
		return message;
	}

}
