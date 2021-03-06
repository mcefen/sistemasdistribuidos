package es.urjc.laliga;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.samskivert.mustache.Mustache;

@ControllerAdvice
class LayoutAdvice {
	private final Mustache.Compiler compiler;

	@Autowired
	public LayoutAdvice( Mustache.Compiler compiler) {
		this.compiler = compiler;
	}

	@ModelAttribute("layout")
	public Mustache.Lambda layout(Map<String, Object> model) {
		return new Layout(compiler);
	}
}