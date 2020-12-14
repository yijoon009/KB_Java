package test;

import java.util.*;

public class ListEx {

   public static void main(String[] args) {
      BoardDao dao = new BoardDao();
      List<Board> list = dao.getBoardList();
        for(Board board  : list) {
           System.out.println(board.getTitle() + " - "+board.getContent());
        }
   }

}

class Board{
   private String title;
   private String content;
   
   public Board(String title, String content) {
       this.title=title;
       this.content = content;
   }
   public String getContent() {
      return content;
   }
   public String getTitle() {
      return title;
   }
}

class BoardDao {
   public BoardDao() {;}
   
   List<Board> getBoardList(){
      List<Board>  list = new ArrayList<Board>();
      list.add(new Board("title1","content1"));
      return list;
   }
}

