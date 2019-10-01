package com.iris.messanger.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.iris.messanger.model.Message;
import com.iris.messanger.model.Profile;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap();
	private static Map<Long, Profile> profiles = new HashMap();

	static {
		messages.put((long) 1, new Message(1, "hello1", new Date(), "ram1"));
		messages.put((long) 2, new Message(2, "hello2", new Date(), "ram2"));
		messages.put((long) 3, new Message(3, "hello3", new Date(), "ram3"));
		messages.put((long) 4, new Message(4, "hello4", new Date(), "ram4"));
	}

	public static Map<Long, Message> getMessages() {
		return messages;
	}

	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}

	public static void setMessages(final Map<Long, Message> messages) {
		DatabaseClass.messages = messages;
	}

	public static void setProfiles(final Map<Long, Profile> profiles) {
		DatabaseClass.profiles = profiles;
	}

}
