public class Client {
    public void share(String message){
        SocialMediaFacede sf = new SocialMediaFacede(new Twitter(), new Facebook());
        sf.share(message);
    }
}
