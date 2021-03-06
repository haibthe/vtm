package org.oscim.backend;

import org.xml.sax.Attributes;

import com.google.gwt.xml.client.NamedNodeMap;
import com.google.gwt.xml.client.Node;

public class MyAttributes implements Attributes {
	private NamedNodeMap map;

	public MyAttributes(Node n) {
		map = n.getAttributes();
	}

	public String getValue(int i) {
		return map.item(i).getNodeValue();
	}

	public int getLength() {
		return map.getLength();
	}

	public String getLocalName(int i) {
		return map.item(i).getNodeName();
	}

	public String getValue(String string) {
		Node n = map.getNamedItem(string);
		if (n == null)
			return null;

		return n.getNodeValue();
	}

	@Override
	public String getURI(int paramInt) {
		return null;
	}

	@Override
	public String getQName(int paramInt) {
		return null;
	}

	@Override
	public String getType(int paramInt) {
		return null;
	}

	@Override
	public int getIndex(String paramString1, String paramString2) {
		return 0;
	}

	@Override
	public int getIndex(String paramString) {
		return 0;
	}

	@Override
	public String getType(String paramString1, String paramString2) {
		return null;
	}

	@Override
	public String getType(String paramString) {
		return null;
	}

	@Override
	public String getValue(String paramString1, String paramString2) {
		return null;
	}

}
