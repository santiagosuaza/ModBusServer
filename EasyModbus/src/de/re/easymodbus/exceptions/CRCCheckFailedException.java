

package de.re.easymodbus.exceptions;

@SuppressWarnings("serial")
public class CRCCheckFailedException extends de.re.easymodbus.exceptions.ModbusException
{
  public CRCCheckFailedException()
  {
  }

  public CRCCheckFailedException( String s )
  {
    super( s );
  }
}


