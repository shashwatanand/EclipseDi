/*
 * generated by Xtext 2.18.0.M3
 */
package de.shashwat.xtext.homeauto.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RuleDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/shashwat/xtext/homeauto/parser/antlr/internal/InternalRuleDSL.tokens");
	}
}
