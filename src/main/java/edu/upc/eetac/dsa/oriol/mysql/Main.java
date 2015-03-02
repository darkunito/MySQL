package edu.upc.eetac.dsa.oriol.mysql;

import edu.upc.eetac.dsa.oriol.mysql.MySQLPieces;

public class Main {
  public static void main(String[] args) throws Exception {
    MySQLPieces dao = new MySQLPieces();
    dao.readDataBase();
  }

} 