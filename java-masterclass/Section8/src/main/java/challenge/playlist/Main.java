package challenge.playlist;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

       Album album = new Album("Stormbringer", "Deep Purple");
       album.addSong("Stormbringer", 4.46);
       album.addSong("Love don't mean a thing", 4.22);
       album.addSong("Holy man", 4.3);
       album.addSong("Hold on", 5.6);
       album.addSong("Lady double dealer", 3.21);
       album.addSong("You can't do it right", 6.23);
       album.addSong("High ball shooter", 4.27);
       album.addSong("The gypsy", 4.2);
       album.addSong("Soldier of fortune", 4.46);
       albums.add(album);

       album = new Album("For those about to rock", "AC/DC");
       album.addSong("For those about to rock", 5.44);
       album.addSong("I put the finger on you", 3.25);
       album.addSong("Lets go", 3.45);
       album.addSong("Inject the venom", 3.33);
       album.addSong("Snowballed", 4.51);
       album.addSong("Evil walks", 3.45);
       album.addSong("C.O.D.", 5.25);
       album.addSong("Breaking the rules", 5.32);
       album.addSong("Night of the long knives", 5.12);
       albums.add(album);

       List<Song> playList = new ArrayList<>();
       albums.get(0).addToPlayList("You can't do it right", playList);
       albums.get(0).addToPlayList("Holy man", playList);
       albums.get(0).addToPlayList("Speed King", playList);
       albums.get(0).addToPlayList(9, playList);
       albums.get(0).addToPlayList(8, playList);
       albums.get(0).addToPlayList(3, playList);
       albums.get(0).addToPlayList(2, playList);
       albums.get(0).addToPlayList(24, playList);

       play(playList);
    }

    private static void play(List<Song> playlist) {
       ListIterator<Song> listIterator = playlist.listIterator();
       Scanner scanner = new Scanner(System.in);
       boolean quit = false;
       boolean forward = true;

       if(playlist.isEmpty()) {
          System.out.println("No songs in playlist");
          return;
       } else {
          System.out.println("Now playing " + listIterator.next().toString());
          printMenu();
       }

       while(!quit) {
          int action = scanner.nextInt();
          scanner.nextLine();

          switch(action) {
             case 0:
                System.out.println("PlayList Complete.");
                quit = true;
                break;
             case 1:
                if(!forward) {
                   if(listIterator.hasNext()) {
                      listIterator.next();
                   }
                   forward = true;
                }

                if(listIterator.hasNext()) {
                   System.out.println("Now playing " + listIterator.next().toString());
                } else {
                   System.out.println("We have reached the end of the playlist");
                   forward = false;
                }
                break;
             case 2:
                if (forward) {
                   if(listIterator.hasPrevious()) {
                      listIterator.previous();
                   }
                   forward = false;
                }
                if(listIterator.hasPrevious()) {
                   System.out.println("Now playing " + listIterator.previous().toString());
                } else {
                   System.out.println("We are at the start of the playlist");
                   forward = true;
                }
                break;
             case 3:
                if(forward) {
                   if(listIterator.hasPrevious()) {
                      System.out.println("Now replaying " + listIterator.previous());
                      forward = false;
                   } else {
                      System.out.println("We are at the start of the list");
                   }
                } else {
                   if(listIterator.hasNext()) {
                      System.out.println("Now replaying " + listIterator.next());
                      forward = true;
                   } else {
                      System.out.println("We have reached the end of the list");
                   }
                }
                break;
             case 4:
                printList(playlist);
                break;
             case 5:
                printMenu();
                break;
             case 6:
                if(!playlist.isEmpty()) {
                   listIterator.remove();
                   if(listIterator.hasNext()) {
                      System.out.println("Now playing " + listIterator.next());
                   } else if(listIterator.hasPrevious()){
                      System.out.println("Now plating " + listIterator.hasPrevious());
                   }
                }
                break;
          }
       }
    }

    private static void printMenu() {
       StringBuilder sb = new StringBuilder();
       sb.append("Available actions:\npress\n");
       sb.append("0 - to quit\n");
       sb.append("1 - to play next song\n");
       sb.append("2 - to play previus song\n");
       sb.append("3 - to replay the current song\n");
       sb.append("4 - list songs in the playlist\n");
       sb.append("5 - print available actions\n");
       sb.append("6 - delete current song from de playlist\n");

       System.out.println(sb);
    }

    private static void printList(List<Song> playList) {
       Iterator<Song> iterator = playList.iterator();

       System.out.println("===============================================");
       while(iterator.hasNext()) {
          System.out.println(iterator.next());
       }
       System.out.println("===============================================");
    }

}
