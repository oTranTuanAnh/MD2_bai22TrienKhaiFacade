public class SocialMediaFacede {
    private Twitter twitter;
    private Facebook facebook;

    public SocialMediaFacede(Twitter twitter, Facebook facebook) {
        this.twitter = twitter;
        this.facebook = facebook;
    }
    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.twitter.share();
        this.facebook.share();
    }
}
