package tpms.tirepressuremonitoringsystem;
import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestAlarm extends TestCase{
	public void alarmTriggersWhenPressureIsTooLow(){
		Sensor sensor = mock(Sensor.class);
		when(sensor.popNextPressurePsiValue()).thenReturn(0.0);
		
		Alarm alarm = new Alarm(sensor);
		alarm.check();
		assertTrue(alarm.isAlarmOn());
	}
}
