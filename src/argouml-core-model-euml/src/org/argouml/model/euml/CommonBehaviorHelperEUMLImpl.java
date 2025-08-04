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
import java.util.List;

import org.argouml.model.CommonBehaviorHelper;
import org.eclipse.uml2.uml.InstanceSpecification;

/**
 * Eclipse UML2 implementation of CommonBehaviorHelper.
 */
class CommonBehaviorHelperEUMLImpl implements CommonBehaviorHelper {

    /**
     * The model implementation.
     */
    private EUMLModelImplementation modelImpl;

    /**
     * Constructor.
     *
     * @param implementation The ModelImplementation.
     */
    public CommonBehaviorHelperEUMLImpl(EUMLModelImplementation implementation) {
        modelImpl = implementation;
    }

    public void addAction(Object handle, Object action) {
        System.out.println("SATD ID: 815");
        
    }

    public void addAction(Object handle, int position, Object action) {
        System.out.println("SATD ID: 193");
        
    }

    public void addActualArgument(Object handle, Object argument) {
        System.out.println("SATD ID: 1052");
        
    }

    public void addActualArgument(Object handle, int position, Object argument) {
        System.out.println("SATD ID: 380");
        
    }

    public void addClassifier(Object handle, Object classifier) {
        System.out.println("SATD ID: 209");
        
    }

    public void addStimulus(Object handle, Object stimulus) {
        System.out.println("SATD ID: 650");
        
    }

    public Object getActionOwner(Object handle) {
        System.out.println("SATD ID: 1054");
        return null;
    }

    public Object getDestination(Object link) {
        System.out.println("SATD ID: 614");
        return null;
    }

    public Object getInstantiation(Object createaction) {
        System.out.println("SATD ID: 309");
        return null;
    }

    public Object getSource(Object link) {
        System.out.println("SATD ID: 446");
        return null;
    }

    public void removeAction(Object handle, Object action) {
        System.out.println("SATD ID: 499");
        
    }

    public void removeActualArgument(Object handle, Object argument) {
        System.out.println("SATD ID: 186");
        
    }

    public void removeClassifier(Object handle, Object classifier) {
        System.out.println("SATD ID: 542");
        
    }

    public void removeContext(Object handle, Object context) {
        System.out.println("SATD ID: 220");
        
    }

    public void removeReception(Object handle, Object reception) {
        System.out.println("SATD ID: 672");
        
    }

    public void setActualArguments(Object action, List arguments) {
        System.out.println("SATD ID: 951");
        
    }

    public void setAsynchronous(Object handle, boolean value) {
        System.out.println("SATD ID: 1050");
        
    }


    public void setClassifiers(Object handle, Collection classifiers) {
        ((InstanceSpecification) handle).getClassifiers().retainAll(classifiers);
        classifiers.removeAll(((InstanceSpecification) handle).getClassifiers());
        ((InstanceSpecification) handle).getClassifiers().addAll(classifiers);
    }
    
    public void setCommunicationLink(Object handle, Object c) {
        System.out.println("SATD ID: 909");
        
    }

    public void setComponentInstance(Object handle, Object c) {
        System.out.println("SATD ID: 354");
        
    }

    public void setContexts(Object handle, Collection c) {
        System.out.println("SATD ID: 871");
        
    }

    public void setDispatchAction(Object handle, Object value) {
        System.out.println("SATD ID: 13");
        
    }

    public void setInstance(Object handle, Object inst) {
        System.out.println("SATD ID: 890");
        
    }

    public void setInstantiation(Object createaction, Object instantiation) {
        System.out.println("SATD ID: 749");
        
    }

    public void setNodeInstance(Object handle, Object nodeInstance) {
        System.out.println("SATD ID: 228");
        
    }

    public void setOperation(Object handle, Object operation) {
        System.out.println("SATD ID: 48");
        
    }

    public void setReceiver(Object handle, Object receiver) {
        System.out.println("SATD ID: 1055");
        
    }

    public void setReception(Object handle, Collection receptions) {
        System.out.println("SATD ID: 463");
        
    }

    public void setRecurrence(Object handle, Object expr) {
        System.out.println("SATD ID: 69");
        
    }

    public void setScript(Object handle, Object expr) {
        System.out.println("SATD ID: 578");
        
    }

    public void setSender(Object handle, Object sender) {
        System.out.println("SATD ID: 25");
        
    }

    public void setSignal(Object handle, Object signal) {
        System.out.println("SATD ID: 1166");
        
    }

    public void setSpecification(Object handle, String specification) {
        System.out.println("SATD ID: 892");
        
    }

    public void setTarget(Object handle, Object element) {
        System.out.println("SATD ID: 878");
        
    }

    public void setTransition(Object handle, Object trans) {
        System.out.println("SATD ID: 788");
        
    }

    public void setValue(Object handle, Object value) {
        System.out.println("SATD ID: 432");
        
    }


}
