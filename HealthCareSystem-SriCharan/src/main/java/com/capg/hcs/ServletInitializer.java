<<<<<<< HEAD
package com.capg.hcs;

public class ServletInitializer {

}
=======
package com.capg.hcs;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HealthCareSystemSriCharanApplication.class);
	}

}
>>>>>>> branch 'master' of https://github.com/BVRITHCS5/HealthCareManagement.git
