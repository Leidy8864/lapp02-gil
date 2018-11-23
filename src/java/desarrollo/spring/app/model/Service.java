package desarrollo.spring.app.model;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
@org.springframework.stereotype.Service
public class Service {
  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public Service(DataSource dataSource) {
	 jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public int obtenerCantCuentas() {
	 String sql = "select count(*) from employees";
	 int rowCount = jdbcTemplate.queryForInt(sql);
	 return rowCount;
  }

  public double obtenerSaldoTotal() {
	 String sql = "select sum(salary) from employees";
	 Double saldo = jdbcTemplate.queryForObject(sql, Double.class);
	 return saldo;
  }
  
  public List obtenerCantOcupacion() {
	 String sql = "select ocupacion, count(employee_id) as numero"
                 + " from employees group by ocupacion";
	 List list = jdbcTemplate.queryForList(sql);
	 return list;
  }
  
  public List obtenerSalarioTotalOcupacion() {
	 String sql = "select ocupacion, sum(salary) as total "
                 + " from employees group by ocupacion";
	 List list = jdbcTemplate.queryForList(sql);
	 return list;
  }
}
