import java.util.Scanner;

public class TicTacToe {
  public static void main(String [] args) {
    boolean finished = false;
    String aux = "";
    int aux2 = 0;
    boolean moved = false;
    int moves = 0;
    boolean vC;
    int count;
    int [][] tableArray = new int [3][3];
    int [] usedCoor = new int [9];

    Scanner sc = new Scanner(System.in);
 
    /* Empty array */
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        tableArray[i][j] = -1;
      }
    } 

    /* Empty table */
    System.out.println("\t\t\t\tTIC-TAC-TOE");
    System.out.println();
    System.out.println("\t\t\t\t   #   #   ");
    System.out.println("\t\t\t\t 7 # 8 # 9 ");
    System.out.println("\t\t\t\t   #   #   ");
    System.out.println("\t\t\t\t###########");
    System.out.println("\t\t\t\t   #   #   ");
    System.out.println("\t\t\t\t 4 # 5 # 6 ");
    System.out.println("\t\t\t\t   #   #   ");
    System.out.println("\t\t\t\t###########");
    System.out.println("\t\t\t\t   #   #   ");
    System.out.println("\t\t\t\t 1 # 2 # 3 ");
    System.out.println("\t\t\t\t   #   #   ");
    System.out.println();

    /* Main loop */
    while (finished == false) {
      moves++;
      /* X's turn */
      moved = false;
      System.out.println("\t\t\t\tX's turn");
      while (moved == false) {
        aux = sc.nextLine();
        while (aux.length() < 1) {
          System.out.println("\t\t\tGive me a valid coordinate.");
          aux = sc.nextLine();
        }
        while (aux.length() > 1) {
          System.out.println("\t\t\tGive me a valid coordinate.");
	  aux = sc.nextLine();
          while (aux.length() < 1) {
            System.out.println("\t\t\tGive me a valid coordinate.");
            aux = sc.nextLine();
          }
        }
        aux2 = (int) aux.charAt(0);
        vC = true;
        count = 0;
        while (count < 9) {
          if (aux2 == usedCoor[count]) {
            System.out.println("\t\t\tCoordinate already chosen.");
            count = 9;
            vC = false;
          } else {
            count++;
          }
        }
        if ((aux2 == 49)&&(vC == true)) {
          tableArray[2][0] = 1;
          usedCoor[moves-1] = 49;
          moved = true;
        } else if ((aux2 == 50)&&(vC == true)) {
          tableArray[2][1] = 1;
          usedCoor[moves-1] = 50;
          moved = true;
        } else if ((aux2 == 51)&&(vC == true)) {
          tableArray[2][2] = 1;
          usedCoor[moves-1] = 51;
          moved = true;
        } else if ((aux2 == 52)&&(vC == true)) {
          tableArray[1][0] = 1;
          usedCoor[moves-1] = 52;
          moved = true;
        } else if ((aux2 == 53)&&(vC == true)) {
          tableArray[1][1] = 1;
          usedCoor[moves-1] = 53;
          moved = true;
        } else if ((aux2 == 54)&&(vC == true)) {
          tableArray[1][2] = 1;
          usedCoor[moves-1] = 54;
          moved = true;
        } else if ((aux2 == 55)&&(vC == true)) {
          tableArray[0][0] = 1;
          usedCoor[moves-1] = 55;
          moved = true;
        } else if ((aux2 == 56)&&(vC == true)) {
          tableArray[0][1] = 1;
          usedCoor[moves-1] = 56;
          moved = true;
        } else if ((aux2 == 57)&&(vC == true)) {
          tableArray[0][2] = 1;
          usedCoor[moves-1] = 57;
          moved = true;
        } else {
          System.out.println("\t\t\tGive me a valid coordinate.");
          moved = false;
        }
      }
      System.out.println();
      /* Printing loops */
      for (int i = 0; i < 3; i++) {
        System.out.println("\t\t\t\t   #   #   ");
        for (int j = 0; j < 3; j++) {
          /* For blank spaces */
          if (tableArray[i][j] == -1) {
            /* [0, j] */
            if (i == 0) {
              /* [0, 0] */
              if (j == 0) {
                System.out.print("\t\t\t\t 7 #");
              /* [0, 1] */
              } else if (j == 1) {
                System.out.print(" 8 #");
              /* [0, 2] */
              } else {
                System.out.println(" 9 ");
              }
            }
            /* [1, j] */
            if (i == 1) {
              /* [1, 0] */
              if (j == 0) {
                System.out.print("\t\t\t\t 4 #");
              /* [1, 1] */
              } else if (j == 1) {
                System.out.print(" 5 #");
              /* [1, 2] */
              } else {
                System.out.println(" 6 ");
              }
            }
            /* [2, j] */
            if (i == 2) {
              /* [2, 0] */
              if (j == 0) {
                System.out.print("\t\t\t\t 1 #");
              /* [2, 1] */
              } else if (j == 1) {
                System.out.print(" 2 #");
              /* [2, 2] */
              } else {
                System.out.println(" 3 ");
              }
            }
          }
          /* For X'es */
          if (tableArray[i][j] == 1) {
            /* [i, 0] */
            if (j == 0) {
              System.out.print("\t\t\t\t X #");
            /* [i, 1] */
            } else if (j == 1) {
              System.out.print(" X #");
            /* [i, 2] */
            } else {
              System.out.println(" X ");
            }
          }
          /* For O's */
          if (tableArray[i][j] == 0) {
            /* [i, 0] */
            if (j == 0) {
              System.out.print("\t\t\t\t O #");
            /* [i, 1] */
            } else if (j == 1) {
              System.out.print(" O #");
            /* [i, 2] */
            } else {
              System.out.println(" O ");
            }
          }
        }
        System.out.println("\t\t\t\t   #   #   ");
        if (i < 2) {
          System.out.println("\t\t\t\t###########");
        } else {
          System.out.println();
        }
      }
      /* Checking if X has won */
      if ((tableArray[0][0]==1)&&(tableArray[1][1]==1)&&(tableArray[2][2]==1))  {
        System.out.println("\t\t\t\tX HAS WON!");
        break;
      } else if ((tableArray[2][0]==1)&&(tableArray[1][1]==1)&&(tableArray[0][2]==1))  {
        System.out.println("\t\t\t\tX HAS WON!");
        break;
      } else if ((tableArray[0][0]==1)&&(tableArray[0][1]==1)&&(tableArray[0][2]==1))  {
        System.out.println("\t\t\t\tX HAS WON!");
        break;
      } else if ((tableArray[1][0]==1)&&(tableArray[1][1]==1)&&(tableArray[1][2]==1))  {
        System.out.println("\t\t\t\tX HAS WON!");
        break;
      } else if ((tableArray[2][0]==1)&&(tableArray[2][1]==1)&&(tableArray[2][2]==1))  {
        System.out.println("\t\t\t\tX HAS WON!");
        break;
      } else if ((tableArray[2][0]==1)&&(tableArray[1][0]==1)&&(tableArray[0][0]==1))  {
        System.out.println("\t\t\t\tX HAS WON!");
        break;
      } else if ((tableArray[2][1]==1)&&(tableArray[1][1]==1)&&(tableArray[0][1]==1))  {
        System.out.println("\t\t\t\tX HAS WON!");
        break;
      } else if ((tableArray[2][2]==1)&&(tableArray[1][2]==1)&&(tableArray[0][2]==1))  {
        System.out.println("\t\t\t\tX HAS WON!");
        break;
      }

      /* Checking when there are not more coordinates available */
      if (moves == 9) {
        System.out.println("\t\t\tNo more movements/coordinates!");
        System.out.println("\t\t\t\tThe Game is a DRAW");
        break;
      }

      moves++;
      /* O's turn */
      moved = false;
      System.out.println("\t\t\t\tO's turn");
      while (moved == false) {
        aux = sc.nextLine();
        while (aux.length() < 1) {
          System.out.println("\t\t\tGive me a valid coordinate.");
          aux = sc.nextLine();
        }
        while (aux.length() > 1) {
          System.out.println("\t\t\tGive me a valid coordinate.");
	  aux = sc.nextLine();
          while (aux.length() < 1) {
            System.out.println("\t\t\tGive me a valid coordinate.");
            aux = sc.nextLine();
          }
        }
        aux2 = (int) aux.charAt(0);
        vC = true;
        count = 0;
        while (count < 9) {
          if (aux2 == usedCoor[count]) {
            System.out.println("\t\t\tCoordinate already chosen.");
            count = 9;
            vC = false;
          } else {
            count++;
          }
        }
        if ((aux2 == 49)&&(vC == true)) {
          tableArray[2][0] = 0;
          usedCoor[moves-1] = 49;
          moved = true;
        } else if ((aux2 == 50)&&(vC == true)) {
          tableArray[2][1] = 0;
          usedCoor[moves-1] = 50;
          moved = true;
        } else if ((aux2 == 51)&&(vC == true)) {
          tableArray[2][2] = 0;
          usedCoor[moves-1] = 51;
          moved = true;
        } else if ((aux2 == 52)&&(vC == true)) {
          tableArray[1][0] = 0;
          usedCoor[moves-1] = 52;
          moved = true;
        } else if ((aux2 == 53)&&(vC == true)) {
          tableArray[1][1] = 0;
          usedCoor[moves-1] = 53;
          moved = true;
        } else if ((aux2 == 54)&&(vC == true)) {
          tableArray[1][2] = 0;
          usedCoor[moves-1] = 54;
          moved = true;
        } else if ((aux2 == 55)&&(vC == true)) {
          tableArray[0][0] = 0;
          usedCoor[moves-1] = 55;
          moved = true;
        } else if ((aux2 == 56)&&(vC == true)) {
          tableArray[0][1] = 0;
          usedCoor[moves-1] = 56;
          moved = true;
        } else if ((aux2 == 57)&&(vC == true)) {
          tableArray[0][2] = 0;
          usedCoor[moves-1] = 57;
          moved = true;
        } else {
          System.out.println("\t\t\tGive me a valid coordinate.");
          moved = false;
        }
      }
      System.out.println();
      /* Printing loops */
      for (int i = 0; i < 3; i++) {
        System.out.println("\t\t\t\t   #   #   ");
        for (int j = 0; j < 3; j++) {
          /* For blank spaces */
          if (tableArray[i][j] == -1) {
            /* [0, j] */
            if (i == 0) {
              /* [0, 0] */
              if (j == 0) {
                System.out.print("\t\t\t\t 7 #");
              /* [0, 1] */
              } else if (j == 1) {
                System.out.print(" 8 #");
              /* [0, 2] */
              } else {
                System.out.println(" 9 ");
              }
            }
            /* [1, j] */
            if (i == 1) {
              /* [1, 0] */
              if (j == 0) {
                System.out.print("\t\t\t\t 4 #");
              /* [1, 1] */
              } else if (j == 1) {
                System.out.print(" 5 #");
              /* [1, 2] */
              } else {
                System.out.println(" 6 ");
              }
            }
            /* [2, j] */
            if (i == 2) {
              /* [2, 0] */
              if (j == 0) {
                System.out.print("\t\t\t\t 1 #");
              /* [2, 1] */
              } else if (j == 1) {
                System.out.print(" 2 #");
              /* [2, 2] */
              } else {
                System.out.println(" 3 ");
              }
            }
          }
          /* For X'es */
          if (tableArray[i][j] == 1) {
            /* [i, 0] */
            if (j == 0) {
              System.out.print("\t\t\t\t X #");
            /* [i, 1] */
            } else if (j == 1) {
              System.out.print(" X #");
            /* [i, 2] */
            } else {
              System.out.println(" X ");
            }
          }
          /* For O's */
          if (tableArray[i][j] == 0) {
            /* [i, 0] */
            if (j == 0) {
              System.out.print("\t\t\t\t O #");
            /* [i, 1] */
            } else if (j == 1) {
              System.out.print(" O #");
            /* [i, 2] */
            } else {
              System.out.println(" O ");
            }
          }
        }
        System.out.println("\t\t\t\t   #   #   ");
        if (i < 2) {
          System.out.println("\t\t\t\t###########");
        } else {
          System.out.println();
        }
      }
      /* Checking if X has won */
      if ((tableArray[0][0]==0)&&(tableArray[1][1]==0)&&(tableArray[2][2]==0))  {
        System.out.println("\t\t\t\tO HAS WON!");
        break;
      } else if ((tableArray[2][0]==0)&&(tableArray[1][1]==0)&&(tableArray[0][2]==0))  {
        System.out.println("\t\t\t\tO HAS WON!");
        break;
      } else if ((tableArray[0][0]==0)&&(tableArray[0][1]==0)&&(tableArray[0][2]==0))  {
        System.out.println("\t\t\t\tO HAS WON!");
        break;
      } else if ((tableArray[1][0]==0)&&(tableArray[1][1]==0)&&(tableArray[1][2]==0))  {
        System.out.println("\t\t\t\tO HAS WON!");
        break;
      } else if ((tableArray[2][0]==0)&&(tableArray[2][1]==0)&&(tableArray[2][2]==0))  {
        System.out.println("\t\t\t\tO HAS WON!");
        break;
      } else if ((tableArray[2][0]==0)&&(tableArray[1][0]==0)&&(tableArray[0][0]==0))  {
        System.out.println("\t\t\t\tO HAS WON!");
        break;
      } else if ((tableArray[2][1]==0)&&(tableArray[1][1]==0)&&(tableArray[0][1]==0))  {
        System.out.println("\t\t\t\tO HAS WON!");
        break;
      } else if ((tableArray[2][2]==0)&&(tableArray[1][2]==0)&&(tableArray[0][2]==0))  {
        System.out.println("\t\t\t\tO HAS WON!");
        break;
      }
    }

  }
}