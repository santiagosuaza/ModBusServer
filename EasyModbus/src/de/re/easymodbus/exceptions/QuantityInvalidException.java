
package de.re.easymodbus.exceptions;

@SuppressWarnings("serial")
public class QuantityInvalidException extends ModbusException
{
  public QuantityInvalidException()
  {
  }

  public QuantityInvalidException( String s )
  {
    super( s );
  }
}


