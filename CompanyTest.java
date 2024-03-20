

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest{
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;
    private Company company;
    private Property property1;
    private Property property2;
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest(){
        
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp(){
        client1 = new User("José Manuel", "911111111","zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222","tochico@hotmail.com");
        seller1 = new User ("Fernando Fernandes","966777101","fefe@remax.pt");
        seller2 = new User ("Rodrigo Rodrigues","966777152","roro@remax.pt");
        company = new Company();
        property1 = new Property("T3 Monte Belo", 150000.0);
        property2 = new Property("T1 Lisboa", 999999.0);
        
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testConstructor(){
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getProperties());
        assertNotNull(company.getSells());
    }
    
    
    @Test
    public void testRegisterClient(){
        assertEquals(true, company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClients(){
        assertEquals(true, company.registerClient(client1));
        assertEquals(true, company.registerClient(client2));
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        assertEquals(true, company.registerClient(client1));
        assertEquals(false, company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull(){
        assertEquals(false, company.registerClient(null));
    }
    
    @Test
    public void testRegisterSeller(){
        assertEquals(true, company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellers(){
        assertEquals(true, company.registerSeller(seller1));
        assertEquals(true, company.registerSeller(seller2));
    }
    
    @Test
    public void testRegisterSellerDuplicate(){
        assertEquals(true, company.registerSeller(seller1));
        assertEquals(false, company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellerNull(){
        assertFalse(company.registerSeller(null));
    }
    
    @Test
    public void testRegisterProperty(){
        assertTrue(company.registerProperty(property1));
    }
    
    @Test
    public void testRegisterProperties(){
        assertEquals(true, company.registerProperty(property1));
    }
    
    @Test
    public void testRegisterPropertyDuplicate()
    {
        assertEquals(true, company.registerProperty(property1));
        assertEquals(false, company.registerProperty(property1));
    }
    
    @Test
    public void testRegisterVehicleNull(){
        assertEquals(false, company.registerProperty(null));
    }

}
