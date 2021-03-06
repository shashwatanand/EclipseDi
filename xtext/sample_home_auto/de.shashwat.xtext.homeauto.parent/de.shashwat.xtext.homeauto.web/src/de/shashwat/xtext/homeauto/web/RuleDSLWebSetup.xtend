/*
 * generated by Xtext 2.18.0.M3
 */
package de.shashwat.xtext.homeauto.web

import com.google.inject.Guice
import com.google.inject.Injector
import de.shashwat.xtext.homeauto.RuleDSLRuntimeModule
import de.shashwat.xtext.homeauto.RuleDSLStandaloneSetup
import de.shashwat.xtext.homeauto.ide.RuleDSLIdeModule
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages in web applications.
 */
class RuleDSLWebSetup extends RuleDSLStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new RuleDSLRuntimeModule, new RuleDSLIdeModule, new RuleDSLWebModule))
	}
	
}
