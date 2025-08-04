// $Id$
/*******************************************************************************
 * Copyright (c) 2007,2010 Tom Morris and other contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tom Morris - initial framework
 *******************************************************************************/
package org.argouml.model.euml;

import java.util.Collection;

import org.argouml.model.ActivityGraphsHelper;

/**
 * The implementation of the ActivityGraphsHelper for EUML.
 */
class ActivityGraphsHelperEUMLImpl implements ActivityGraphsHelper {

    /**
     * The model implementation.
     */
    private EUMLModelImplementation modelImpl;

    /**
     * Constructor.
     * 
     * @param implementation
     *            The ModelImplementation.
     */
    public ActivityGraphsHelperEUMLImpl(EUMLModelImplementation implementation) {
        modelImpl = implementation;
    }

    public void addContent(Object partition, Object modeElement) {
        System.out.println("SATD ID: 105");

    }

    public void addInState(Object classifierInState, Object state) {
        System.out.println("SATD ID: 1026");

    }

    public void addParameter(Object objectFlowState, Object parameter) {
        System.out.println("SATD ID: 571");

    }

    public Object findClassifierByName(Object ofs, String s) {
        System.out.println("SATD ID: 17");
        return null;
    }

    public Object findStateByName(Object c, String s) {
        System.out.println("SATD ID: 174");
        return null;
    }

    public boolean isAddingActivityGraphAllowed(Object context) {
        return (context instanceof org.eclipse.uml2.uml.Package);
    }

    public void removeContent(Object partition, Object modeElement) {
        System.out.println("SATD ID: 297");

    }

    public void removeParameter(Object objectFlowState, Object parameter) {
        System.out.println("SATD ID: 868");

    }

    public void setContents(Object partition, Collection newContents) {
        System.out.println("SATD ID: 1134");

    }

    public void setInStates(Object classifierInState, Collection newStates) {
        System.out.println("SATD ID: 681");

    }

    public void setParameters(Object objectFlowState, Collection parameters) {
        System.out.println("SATD ID: 910");

    }

    public void setSynch(Object objectFlowState, boolean isSynch) {
        System.out.println("SATD ID: 114");

    }

}
