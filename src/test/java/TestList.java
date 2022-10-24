    import static org.junit.Assert.*;  
    import static org.mockito.Mockito.mock;  
    import static org.mockito.Mockito.when;  
      
    import java.util.List;  
    import org.junit.Test;  
      /*
       * . Example of mocking List.get() method
       * https://www.javatpoint.com/examples-of-mockito-and-junit-in-eclipse-ide
       */
    public class TestList {  
           
            @Test   
              public void testList_get() {  
            
          List mocklist = mock(List.class);  
            
          when(mocklist.get(0)).thenReturn("Mockito");  
           
          assertEquals("Mockito", mocklist.get(0));  
          System.out.println(mocklist.get(0));  
          }  
     }  
        