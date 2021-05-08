package math.problems;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static databases.ConnectToSqlDB.connect;
import static databases.ConnectToSqlDB.connectToSqlDatabase;

public class PrimeNumber {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use MySql Database to store data and retrieve data.
         *
         */

        List<Integer> primes = new ArrayList<>();
        IntStream.range(2, 1000000)
                .filter(n -> primes.parallelStream().noneMatch(p -> n % p == 0))
                .forEach(primes::add);

        System.out.println(primes);

/*        String username = "root";
        String password = "266535cdX";
        String dbName = "peoplentech";


        String url = "jdbc:mysql://localhost:3306/" + dbName + "";


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement st = connection.prepareStatement("DROP TABLE IF EXISTS tbl_primeNumbers;");
        //st.executeUpdate();

        st = connect.prepareStatement(
                "CREATE TABLE tbl_primeNumbers (`ID` int(11) NOT NULL AUTO_INCREMENT, tbl_primeNumbers bigint(20) DEFAULT NULL,  PRIMARY KEY (`ID`) );");

        String query = "INSERT INTO tbl_primeNumbers (column_primeNumbers) VALUES(?);";
        st.executeQuery(query);*/

    }
}