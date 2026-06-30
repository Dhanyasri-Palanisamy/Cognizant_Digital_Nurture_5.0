package mokito;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create Mock Object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Pass Mock to Service
        MyService service = new MyService(mockApi);

        // Call Method
        service.fetchData();

        // Verify Method Call
        verify(mockApi).getData();
    }
}