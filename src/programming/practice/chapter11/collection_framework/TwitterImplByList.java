package programming.practice.chapter11.collection_framework;

import java.util.ArrayList;
import java.util.List;

public class TwitterImplByList implements Twitter {

	private List<Tweet> list = new ArrayList<>();

	@Override
	public void addTweet(Tweet tweet) {
		list.add(tweet);
		
	}

	@Override
	public void printAllTweets() {
		for(Tweet tweet : list) {
			System.out.println(tweet);
		}
		
	}
	
	public static void main(String[] args) {
		Twitter twitter = new TwitterImplByList();
		
		Tweet tweet = new Tweet("My first Tweet", "Tanvir");
		
		twitter.addTweet(tweet);
		twitter.printAllTweets();
	}

}
