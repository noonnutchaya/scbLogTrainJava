package com.digitalacademy.loan.service;


import com.digitalacademy.loan.model.LoanInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoanService {
    private static final Logger log = LogManager.getLogger(LoanService.class.getName());

    public LoanInfo getLoanInfoById(Long id) throws Exception {
        log.info("get lone info by id: {}",id);

        LoanInfo loanInfo = new LoanInfo();

        if (id.equals(1L)) {
            loanInfo.setId(1L);
            loanInfo.setStatus("ok");
            loanInfo.setAccountPayable("111-111-1111");
            loanInfo.setAccountReceivable("222-222-2222");
            loanInfo.setPrincipalAmount(550000.50);
        }
        else if (id.equals(2L)) {
            log.info("id: {}",id);
//            loanInfo.setStatus("bad request");
//            throw new Exception("exception not found");
        }
        else  {
            log.info(" id: {}",id);
            throw new Exception("test throw new exception") ;
        }


        return loanInfo ;
    }
}
