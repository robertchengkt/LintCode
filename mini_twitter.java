/**
 * Definition of Tweet:
 * public class Tweet {
 *     public int id;
 *     public int user_id;
 *     public String text;
 *     public static Tweet create(int user_id, String tweet_text) {
 *         // This will create a new tweet object,
 *         // and auto fill id
 *     }
 * }
 */
public class MiniTwitter {

    public MiniTwitter() {
        // initialize your data structure here.
        class Node {
            public int order;
            public Tweet tweet;
            public Node(Tweet t, int o){
                this.tweet = t;
                this.order = o;
            }
        }

        class SortByOrder implements Comparator {
            public int compare(Object obj1, Object obj2){
                Node node1 = (Node) obj1;
                Node node2 = (Node) obj2;
                if (node1.order < node2.order)
                    return 1;
                else
                    return -1;
            }
        }

        private Map<Integer, Map<Integer, Boolean>> friends;
        private Map<Integer, List<Node>> users_tweets;
        private int order;

        public MiniTwitter(){
            this.users_tweets = new HashMap<Integer, Map<Integer, Boolean>>();
            this.friends = new HashMap<Integer, List<Node>>();
            this.order = 0;
        }

        public List<Node> getLastTen (List<Node> tmp) {
            int last = 10;
            if (tmp.size() < 10)
                last = tmp.size();
            return tmp.sublist(tmp.size() - last, tmp.size());
        }

        public List<Node> getFirstTen (List<Node> tmp) {
            int last = 10;
            if (tmp.size() < 10)
                last = tmp.size();
            return tmp.sublist(0, last);
        }

        // @param user_id an integer
        // @param tweet a string
        // return a tweet
        public Tweet postTweet(int user_id, String tweet_text) {
            //  Write your code here
            Tweet tweet = Tweet.create(user_id, tweet_text);
            if (!user_tweets.containsKey(user_id)
                users_tweets.put(user_id, new ArrayList<Node>());
            order += 1;
            users_tweets.get(user_id).add(new Node(order,tweet));
            return tweet;
        }

        // @param user_id an integer
        // return a list of 10 new feeds recently
        // and sort by timeline
        public List<Tweet> getNewsFeed(int user_id) {
            // Write your code here
            List<Node> tmp = new ArrayList<Node>();
            if (users_tweets.containsKey(user_id))
                tmp.addAll(getLastTen(users_tweets.get(user_id)));
            if (firends.containsKey(user_id)){
                for (Map.Entry<Integer, Boolean> entry: friends.get(user_id).entrySet()){
                    int user = entry.getKey();
                    if (users_tweets.containsKey(user))
                        tmp.addAll(getLastTen(users_tweets.get(user)));
                }
            }

            Collection.sort(tmp, new SortByOrder());
            List<Tweet> rt = new ArrayList<Tweet>();
            tmp = getFirstTen(tmp);
            for (Node node: tmp){
                rt.add(node.tweet);
            }
            return rt;
        }

        // @param user_id an integer
        // return a list of 10 new posts recently
        // and sort by timeline
        public List<Tweet>  getTimeline(int user_id) {
            // Write your code here
            List<Node> tmp = new ArrayList<Node>();
            if (users_tweets.containsKey(user_id))
                tmp.addAll(getLastTen(users_tweets.get(user_id)));

            Collection.sort(tmp, new SortByOrder());
            List<Tweet> rt = new ArrayList<Tweet>();
            tmp = getFirstTen(tmp);
            for (Node node: tmp)
                rt.add(node.tweet);
            return rt;
        }

        // @param from_user_id an integer
        // @param to_user_id an integer
        // from user_id follows to_user_id
        public void follow(int from_user_id, int to_user_id) {
            // Write your code here
            if (!friends.containsKey(from_user_id))
                friends.put(from_user_id, new HashMap<Integer, Boolean>());

            friends.get(from_user_id).put(to_user_id, true);
        }

        // @param from_user_id an integer
        // @param to_user_id an integer
        // from user_id unfollows to_user_id
        public void unfollow(int from_user_id, int to_user_id) {
            // Write your code here
            if (friends.containsKey(from_user_id))
                friends.get(from_user_id).remove(to_user_id);
        }
    } 
    
}