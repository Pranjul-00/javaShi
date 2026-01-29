import java.util.Scanner;

public class MatrixCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println();
            System.out.println("Matrix Operations");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter number of rows: ");
                    int rAdd = scanner.nextInt();
                    System.out.print("Enter number of columns: ");
                    int cAdd = scanner.nextInt();

                    int[][] matrixA = new int[rAdd][cAdd];
                    int[][] matrixB = new int[rAdd][cAdd];
                    int[][] sumMatrix = new int[rAdd][cAdd];

                    System.out.println("Enter elements of first matrix:");
                    for (int i = 0; i < rAdd; i++) {
                        for (int j = 0; j < cAdd; j++) {
                            System.out.print("Enter value for " + (i + 1) + " " + (j + 1) + ": ");
                            matrixA[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Enter elements of second matrix:");
                    for (int i = 0; i < rAdd; i++) {
                        for (int j = 0; j < cAdd; j++) {
                            System.out.print("Enter value for " + (i + 1) + " " + (j + 1) + ": ");
                            matrixB[i][j] = scanner.nextInt();
                        }
                    }

                    for (int i = 0; i < rAdd; i++) {
                        for (int j = 0; j < cAdd; j++) {
                            sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                        }
                    }

                    System.out.println("Result of Addition: ");
                    for (int i = 0; i < rAdd; i++) {
                        for (int j = 0; j < cAdd; j++) {
                            System.out.print(sumMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter number of rows: ");
                    int rSub = scanner.nextInt();
                    System.out.print("Enter number of columns: ");
                    int cSub = scanner.nextInt();

                    int[][] minuend = new int[rSub][cSub];
                    int[][] subtrahend = new int[rSub][cSub];
                    int[][] diffMatrix = new int[rSub][cSub];

                    System.out.println("Enter elements of first matrix:");
                    for (int i = 0; i < rSub; i++) {
                        for (int j = 0; j < cSub; j++) {
                            System.out.print("Enter value for " + (i + 1) + " " + (j + 1) + ": ");
                            minuend[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Enter elements of second matrix:");
                    for (int i = 0; i < rSub; i++) {
                        for (int j = 0; j < cSub; j++) {
                            System.out.print("Enter value for " + (i + 1) + " " + (j + 1) + ": ");
                            subtrahend[i][j] = scanner.nextInt();
                        }
                    }

                    for (int i = 0; i < rSub; i++) {
                        for (int j = 0; j < cSub; j++) {
                            diffMatrix[i][j] = minuend[i][j] - subtrahend[i][j];
                        }
                    }

                    System.out.println("Result of Subtraction: ");
                    for (int i = 0; i < rSub; i++) {
                        for (int j = 0; j < cSub; j++) {
                            System.out.print(diffMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Enter rows for first matrix: ");
                    int row1 = scanner.nextInt();
                    System.out.print("Enter columns for first matrix: ");
                    int col1 = scanner.nextInt();

                    System.out.print("Enter rows for second matrix: ");
                    int row2 = scanner.nextInt();
                    System.out.print("Enter columns for second matrix: ");
                    int col2 = scanner.nextInt();

                    if (col1 != row2) {
                        System.out.println("Matrix multiplication not possible. Cols of first must equal rows of second.");
                    } else {
                        int[][] matOne = new int[row1][col1];
                        int[][] matTwo = new int[row2][col2];
                        int[][] productResult = new int[row1][col2];

                        System.out.println("Enter elements of first matrix:");
                        for (int i = 0; i < row1; i++) {
                            for (int j = 0; j < col1; j++) {
                                System.out.print("Enter value for " + (i + 1) + " " + (j + 1) + ": ");
                                matOne[i][j] = scanner.nextInt();
                            }
                        }

                        System.out.println("Enter elements of second matrix:");
                        for (int i = 0; i < row2; i++) {
                            for (int j = 0; j < col2; j++) {
                                System.out.print("Enter value for " + (i + 1) + " " + (j + 1) + ": ");
                                matTwo[i][j] = scanner.nextInt();
                            }
                        }

                        for (int i = 0; i < row1; i++) {
                            for (int j = 0; j < col2; j++) {
                                for (int k = 0; k < col1; k++) {
                                    productResult[i][j] += matOne[i][k] * matTwo[k][j];
                                }
                            }
                        }

                        System.out.println("Result of Multiplication:");
                        for (int i = 0; i < row1; i++) {
                            for (int j = 0; j < col2; j++) {
                                System.out.print(productResult[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (option != 4);
    }
}