class Main {
    public static void main(String[] args) {
        Hannah bear = new Hannah();
        // bear.song = "Aeroplane";
        // System.out.println(bear.song);
        bear.setSong("Aeroplane");
        System.out.println("Hannah is currently listening to " + bear.getSong());

        bear.setSong("American Idiot");
        System.out.println("Hannah's other song is " + bear.getSong());

        Hannah dad = new Hannah();
        dad.setSong("Fab Five Freddy");
        dad.setColor("blue");

        System.out.println("Dad carries a " +dad.getColor() + " sword and listens to " +dad.getSong()+ " on his iPhone. Dad meets Hannah at QFC and she's listening to " + bear.getSong() + " on her iPhone.");
    }
}