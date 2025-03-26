interface User{
    void getUserInfo();
}

class Admin implements User{
    public void getUserInfo(){
        System.out.println("Printing user info");
    }
}

