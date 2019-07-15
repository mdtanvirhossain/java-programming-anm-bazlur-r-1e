package programming.practice.chapter11.collection_framework;

public class TwitterImpl implements Twitter {
	
	private static final int MAX_TWEET_SIZE = 10;
	private Tweet[] tweets = new Tweet[MAX_TWEET_SIZE];
	
	private int index = 0;

	@Override
	public void addTweet(Tweet tweet) {
		tweets[index] = tweet;
		index++;
		
	}

	@Override
	public void printAllTweets() {
		for(Tweet tweet : tweets) {
			System.out.println(tweet);
		}
		
	}
	
	public static void main(String[] args) {
		Twitter twitter = new TwitterImpl();
		
		Tweet tweet = new Tweet("My first Tweet", "Tanvir");
		
		twitter.addTweet(tweet);
		twitter.printAllTweets();
	}

}
