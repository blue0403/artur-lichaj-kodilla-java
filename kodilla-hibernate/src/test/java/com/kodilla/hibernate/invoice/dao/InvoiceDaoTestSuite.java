package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product smartphone = new Product("Smartphone Lenovo P2 Dual SIM");
        Product headphones = new Product("Headphones Lenovo Original");
        Product earphone = new Product("Samsung Bluetooth earphone");
        Product speaker = new Product("JBC wireless speaker");
        Product powerBank = new Product("Power bank ADATA 20000mAh");

        productDao.save(smartphone);
        int smartphoneId = smartphone.getId();
        productDao.save(headphones);
        int headphonesId = headphones.getId();
        productDao.save(earphone);
        int earphoneId = earphone.getId();
        productDao.save(speaker);
        int speakerId = speaker.getId();
        productDao.save(powerBank);
        int powerBankId = powerBank.getId();

        Item item = new Item(new BigDecimal(1299.99), 1, new BigDecimal(1299.99));
        Item item1 = new Item(new BigDecimal(14.99), 2, new BigDecimal(29.98));
        Item item2 = new Item(new BigDecimal(49.99), 1, new BigDecimal(49.99));
        Item item3 = new Item(new BigDecimal(339.49), 1, new BigDecimal(339.49));
        Item item4 = new Item(new BigDecimal(99.89), 1, new BigDecimal(99.89));

        smartphone.getItems().add(item);
        headphones.getItems().add(item1);
        earphone.getItems().add(item2);
        speaker.getItems().add(item3);
        powerBank.getItems().add(item4);

        item.setProduct(smartphone);
        item1.setProduct(headphones);
        item2.setProduct(earphone);
        item3.setProduct(speaker);
        item4.setProduct(powerBank);

        Invoice invoice = new Invoice("KODILLA/AL/2018/05/19");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);
        Assert.assertEquals(5, invoice.getItems().size());

        //CleanUp
        invoiceDao.delete(invoiceId);

        productDao.delete(smartphoneId);
        productDao.delete(headphonesId);
        productDao.delete(earphoneId);
        productDao.delete(speakerId);
        productDao.delete(powerBankId);
    }
}
