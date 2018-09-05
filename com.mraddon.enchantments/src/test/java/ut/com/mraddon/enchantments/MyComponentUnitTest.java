package ut.com.mraddon.enchantments;

import org.junit.Test;
import com.mraddon.enchantments.api.MyPluginComponent;
import com.mraddon.enchantments.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}