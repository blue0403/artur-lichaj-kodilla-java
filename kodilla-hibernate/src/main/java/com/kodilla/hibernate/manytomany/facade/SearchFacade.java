package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public void save(Company company) {
        companyDao.save(company);
    }

    public void delete(int id) {
        companyDao.delete(id);
    }

    public List<Company> searchForCompanies(String name) throws SearchProcessingException {
        boolean wasError = false;
        List<Company> companiesByName = companyDao.findMatchingCompanyName(name);
        try {
            if (companiesByName.size() == 0) {
                LOGGER.error(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_COMPANY_NOT_FOUND);
            } else {
                for (Company company : companiesByName) {
                    LOGGER.info("Company: " + company.getName());
                }
            }
        } finally {
            if (wasError) {
                LOGGER.info("No results found");
            }
        }
        return companiesByName;
    }

    public List<Employee> searchForEmployees(String name) throws SearchProcessingException {
        boolean wasError = false;
        List<Employee> employeesByName = employeeDao.findMatchingEmployeeName(name);
        try {
            if (employeesByName.size() == 0) {
                LOGGER.error(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_EMPLOYEE_NOT_FOUND);
            } else {
                for (Employee employee : employeesByName) {
                    LOGGER.info("Employee: " + employee.getFirstname() + " " + employee.getLastname());
                }
            }
        } finally {
            if (wasError) {
                LOGGER.info("No results found");
            }
        }
        return employeesByName;
    }
}
