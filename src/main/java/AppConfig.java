import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.threedtrader.repository.CustomerRepository;
import com.threedtrader.repository.HibernateCustomerRepositoryImpl;
import com.threedtrader.service.CustomerService;
import com.threedtrader.service.CustomerServiceImpl;

@Configuration
@ComponentScan({ "com.threedtrader" })
public class AppConfig {

	//@Bean(name = "customerService")
	//public CustomerService getCustomerService() {
		// CustomerServiceImpl service = new
		// CustomerServiceImpl(getCustomerRepository());
		
		//CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		//return service;

	//}

	//@Bean(name = "customerRepository")
	//public CustomerRepository getCustomerRepository() {
	//	return new HibernateCustomerRepositoryImpl();
	//}

}
