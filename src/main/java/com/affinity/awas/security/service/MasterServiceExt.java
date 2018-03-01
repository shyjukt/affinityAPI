package com.affinity.awas.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.affinity.awas.security.LoggedUserUtil;
import com.affinity.awas.security.entity.VewUtlMenuMast;
import com.affinity.awas.security.repository.VewUtlMenuMastRepo;
import com.affinity.awas.security.entity.MstPersonalMast;
import com.affinity.awas.security.entity.UtlUserProcesses;
import com.affinity.awas.security.repository.MstPersonalMastRepo;
import com.affinity.awas.security.repository.UtlUserProcessesRepoExt;

@Service
public class MasterServiceExt {

	private MstPersonalMastRepo mstpersonalmastRepo;
	@Autowired
    public void setMstPersonalMastRepo (MstPersonalMastRepo mstpersonalmastRepo) {
        this.mstpersonalmastRepo = mstpersonalmastRepo;
    }    
 
	private UtlUserProcessesRepoExt utluserprocessesRepoExt;
	@Autowired
    public void setUtlUserProcessesRepoExt (UtlUserProcessesRepoExt utluserprocessesRepoExt) {
        this.utluserprocessesRepoExt = utluserprocessesRepoExt;
    }

	private VewUtlMenuMastRepo vewutlmenumastRepo;
	@Autowired
    public void setVewUtlMenuMastRepo (VewUtlMenuMastRepo vewutlmenumastRepo) {
        this.vewutlmenumastRepo = vewutlmenumastRepo;
    }
    
	public MstPersonalMast  getSessionPerson(  )
	{ 
		try
		{
		 Integer i=		 LoggedUserUtil.getLoggedUser().getPersCode() ;	
			System.out.println("********* pers_code = " + i);
		 
		 return  mstpersonalmastRepo.findOne(i);
		}
		catch (Exception e) {
			System.out.println("********* Could Not FInd The user");
            return  null;
        }
	}

	public List <UtlUserProcesses>  listSessionProcesses(  )
		{
		try
		{
		 Integer persCode =		 LoggedUserUtil.getLoggedUser().getPersCode() ;	
			System.out.println("********* pers_code = " + persCode);
		 return (List <UtlUserProcesses>) utluserprocessesRepoExt.findByPersCode(persCode);
		}
		catch (Exception e) {
			System.out.println("********* Could Not FInd The user");
            return  null;
        }
				
		}


	public List <VewUtlMenuMast>  listUserMenus(  )
			{return (List <VewUtlMenuMast>) vewutlmenumastRepo.findAll( );
		}
			
	
}
