package beans.events;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class TestEvents extends Setup {

    @Test
    public void testProduceConsume() {

        Producer producer = container.select(Producer.class).get();
        producer.fireEvent();
        producer.fireEvent();
        producer.fireEvent();

        ProducerImportant producerImportant = container.select(ProducerImportant.class).get();
        producerImportant.fireEvent();
        producerImportant.fireEvent();
        producerImportant.fireEvent();

        ConsumerAll consumer = container.select(ConsumerAll.class).get();
        Assert.assertEquals(6, consumer.count);

        ConsumerImportant consumerImportant = container.select(ConsumerImportant.class).get();
        Assert.assertEquals(3, consumerImportant.count);
    }
}
