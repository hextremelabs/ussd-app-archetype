#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.hextremelabs.ussd.handler.UssdHandler;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import java.util.Map;

@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class Handler implements UssdHandler {

  public String[] greetMe(Map<String, Object> data) {
    return new String[]{(String) data.get("nameInput")};
  }
}
