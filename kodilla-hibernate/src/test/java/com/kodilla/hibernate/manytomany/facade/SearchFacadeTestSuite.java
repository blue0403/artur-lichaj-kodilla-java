package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
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

        searchFacade.saveCompany(dataCenter);
        int dataCenterId = dataCenter.getId();
        searchFacade.saveCompany(datenBank);
        int datenBankId = datenBank.getId();
        searchFacade.saveCompany(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        searchFacade.saveCompany(greyMatter);
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
                searchFacade.deleteCompany(dataCenterId);
                searchFacade.deleteCompany(datenBankId);
                searchFacade.deleteCompany(softwareMachineId);
                searchFacade.deleteCompany(greyMatterId);
            }
        }
    }

    @Test
    public void testQueryFindMatchingCompanyNameWithNoResults() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company greyMatter = new Company("Grey Matter");

        searchFacade.saveCompany(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        searchFacade.saveCompany(greyMatter);
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
                searchFacade.deleteCompany(softwareMachineId);
                searchFacade.deleteCompany(greyMatterId);
            }
        }
    }

    @Test
    public void testQueryFindMatchingEmployeeNameWithResults() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaSchmith = new Employee("Linda", "Schmith");

        searchFacade.saveEmployee(johnSmith);
        int johnSmithId = johnSmith.getId();
        searchFacade.saveEmployee(stephanieClarckson);
        int stephanieClarcksonId = stephanieClarckson.getId();
        searchFacade.saveEmployee(lindaSchmith);
        int lindaSchmithId = lindaSchmith.getId();

        //When
        List<Employee> foundEmployees = new ArrayList<>();
        try {
            foundEmployees = searchFacade.searchForEmployees("mit");
        } catch (SearchProcessingException e) {
            //bussines exception - should be handled in real application
        }

        //Then
        try {
            Assert.assertEquals(2, foundEmployees.size());
        } finally {
            //CleanUp
            searchFacade.deleteEmployee(johnSmithId);
            searchFacade.deleteEmployee(stephanieClarcksonId);
            searchFacade.deleteEmployee(lindaSchmithId);
        }
    }

    @Test
    public void testQueryFindMatchingEmployeeNameWithNoResults() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee lindaSchmith = new Employee("Linda", "Schmith");

        searchFacade.saveEmployee(johnSmith);
        int johnSmithId = johnSmith.getId();
        searchFacade.saveEmployee(lindaSchmith);
        int lindaSchmithId = lindaSchmith.getId();

        //When
        List<Employee> foundEmployees = new ArrayList<>();
        try {
            foundEmployees = searchFacade.searchForEmployees("ABR");
        } catch (SearchProcessingException e) {
            //bussines exception - should be handled in real application
        }

        //Then
        try {
            Assert.assertEquals(0, foundEmployees.size());
        } finally {
            //CleanUp
            searchFacade.deleteEmployee(johnSmithId);
            searchFacade.deleteEmployee(lindaSchmithId);
        }
    }
}
