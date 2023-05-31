package jdbc.factory;


public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		CombopooledDataSource combopooledDataSource = new CombopooledDataSource();
		combopooledDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/datos_registro_hotel_alura");
		combopooledDataSource.setJdbcUser("root");
		combopooledDataSource.setJdbcPassword("henderson.01");
		
		this.dataSource = combopooledDataSource;
	}
}
