package com.cgi.uswest.chimpls.providerDetail;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProviderDetailRepository extends CrudRepository<ProviderDetail, String>{
	
	@Query("select p from ProviderDetail p where p.id_provider_org = ?1")
	ProviderDetail findProviderDetailCustomIdPrvdOrg(@Param("idprvdorg") String idprvdorg);
	
}
