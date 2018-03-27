package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(19890423, "john-paul", 'M',1989, 4, 23, 431));
        forumUserList.add(new ForumUser(19770512, "teresa-smith", 'F', 1977, 5, 12, 128));
        forumUserList.add(new ForumUser(19990708, "patrick-weasley", 'M', 1999, 7, 8, 376));
        forumUserList.add(new ForumUser(19841014, "susan-stone", 'F', 1984, 10, 14, 567));
        forumUserList.add(new ForumUser(19871211, "rick-spectre", 'M', 1987, 12, 11, 299));
        forumUserList.add(new ForumUser(19790918, "jared-johnson", 'M', 1979, 9, 18, 334));
        forumUserList.add(new ForumUser(19930616, "matilda-white", 'F', 1993, 6, 16, 452));
        forumUserList.add(new ForumUser(19861103, "will-greenwood", 'M', 1986, 11, 3, 511));
        forumUserList.add(new ForumUser(19980124, "dwight-porter", 'M', 1998, 1, 24, 385));
        forumUserList.add(new ForumUser(19830809, "jessica-howard", 'F', 1983, 8, 9, 246));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList(forumUserList);
    }
}