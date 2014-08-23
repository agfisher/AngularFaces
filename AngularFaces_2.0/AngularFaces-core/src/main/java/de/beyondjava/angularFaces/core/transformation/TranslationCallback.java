package de.beyondjava.angularFaces.core.transformation;

import java.util.List;

import javax.el.ValueExpression;
import javax.faces.component.UICommand;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIOutput;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.visit.VisitCallback;
import javax.faces.component.visit.VisitContext;
import javax.faces.component.visit.VisitResult;

import org.primefaces.component.outputlabel.OutputLabel;

import de.beyondjava.angularFaces.core.ELTools;
import de.beyondjava.angularFaces.core.NGWordUtiltites;
import de.beyondjava.angularFaces.core.i18n.I18n;

public class TranslationCallback implements VisitCallback {
	I18n i18n = null;

	int duplicateLabels = 0;

	@Override
	public VisitResult visit(VisitContext arg0, UIComponent component) {
		if (component instanceof UICommand || component instanceof UIOutput) {
			Object value = component.getAttributes().get("value");
			if (null != value && value instanceof String) {
				String caption = (String) value;
				if (null != caption) {
					String translation = translate(caption);
					if (!caption.equals(translation)) {
						component.getAttributes().put("value", translation);
					}
				}
			}
		} else if (component.getClass().getName().endsWith(".UIInstructions")) {
			// System.out.println("test");
		}

		return VisitResult.ACCEPT;
	}

	private String translate(String caption) {
		if (null == i18n)
			i18n = (I18n) ELTools.evalAsObject("#{i18n}");
		if (null == i18n)
			return caption;
		return i18n.translate(caption);
	}

}