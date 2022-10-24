    import static org.junit.Assert.*;  
    import static org.mockito.Mockito.when;  
      
    import java.util.List;  
    import org.junit.Test;  
    import org.mockito.Mock;
import org.mockito.Mockito;  
      
    public class TestList {  
      
        @Test  
        public void testList_ReturnsSingle_value() {  
      
            List mocklist = Mockito.mock(List.class);  
                               when(mocklist.size()).thenReturn(1);  
      
            assertEquals(1, mocklist.size());  
            assertEquals(1, mocklist.size());  
              
                              System.out.println( mocklist.size());  
            System.out.println(mocklist);  
        }  
     }  