package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber > 0){
            postsPerUser = (double) postsNumber / usersNumber;
            commentsPerUser = (double) commentsNumber / usersNumber;
        } else if (usersNumber == 0){
            postsPerUser = 0;
            commentsPerUser = 0;
        } else {
            throw new IllegalArgumentException("Users number must be positive!");
        }

        if (postsNumber > 0){
            commentsPerPost = (double) commentsNumber / postsNumber;
        } else if (postsNumber == 0){
            commentsPerPost = 0;
        } else {
            throw new IllegalArgumentException("Posts number must be positive " + "to count this statistic!");
        }
    }

    public void showStatistics(Statistics statistics){
        System.out.println("A list of users names:");
        for (String names : statistics.usersNames()){
            System.out.println(names);
        }
        System.out.println("Total quantity of forum posts: " + postsNumber);
        System.out.println("Total quantity of forum comments: " + commentsNumber);
    }

    public int getUsersNumber() {
        return usersNumber;
    }
    public int getPostsNumber() {
        return postsNumber;
    }
    public int getCommentsNumber() {
        return commentsNumber;
    }
    public double getPostsPerUser() {
        return postsPerUser;
    }
    public double getCommentsPerUser() {
        return commentsPerUser;
    }
    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
