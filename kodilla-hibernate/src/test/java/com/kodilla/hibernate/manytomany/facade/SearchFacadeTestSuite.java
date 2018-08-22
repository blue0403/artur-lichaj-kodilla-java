package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;

    @Test
    public void testQueryFindMatchingCompanyNameWithResults() {
        //Given
        Company dataCenter = new Company("DATACENTER");
        Company datenBank = new Company("DatenBank");
        Company softwareMachine = new Company("Software Machine");
        Company greyMatter = new Company("Grey Matter");

        searchFacade.save(dataCenter);
        int dataCenterId = dataCenter.getId();
        searchFacade.save(datenBank);
        int datenBankId = datenBank.getId();
        searchFacade.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        searchFacade.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> foundCompanies = new ArrayList<>();
        try {
            foundCompanies = searchFacade.searchForCompanies("DAT");
        } catch (SearchProcessingException e) {
            //bussines exception - should be handled in real application
        } finally {

            //Then
            try {
                Assert.assertEquals(2, foundCompanies.size());
            } finally {
                //CleanUp
                searchFacade.delete(dataCenterId);
                searchFacade.delete(datenBankId);
                searchFacade.delete(softwareMachineId);
                searchFacade.delete(greyMatterId);
            }
        }
    }

    @Test
    public void testQueryFindMatchingCompanyNameWithNoResults() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company greyMatter = new Company("Grey Matter");

        searchFacade.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        searchFacade.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //When
        List<Company> foundCompanies = new ArrayList<>();
        try {
            foundCompanies = searchFacade.searchForCompanies("SMA");
        } catch (SearchProcessingException e) {
            //bussines exception - should be handled in real application
        } finally {

            //Then
            try {
                Assert.assertEquals(0, foundCompanies.size());
            } finally {
                //CleanUp
                searchFacade.delete(softwareMachineId);
                searchFacade.delete(greyMatterId);
            }
        }
    }
}
