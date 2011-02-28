package org.onebusaway.csv_entities;

import java.util.HashMap;
import java.util.Map;

public class CsvEntityContextImpl implements CsvEntityContext {

  private Map<Object, Object> _params = new HashMap<Object, Object>();

  public Object get(Object key) {
    return _params.get(key);
  }

  public Object put(Object key, Object value) {
    return _params.put(key, value);
  }
}
