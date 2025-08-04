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

import org.argouml.model.AbstractModelFactory;
import org.argouml.model.CommonBehaviorFactory;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.Signal;
import org.eclipse.uml2.uml.UMLFactory;

/**
 * The implementation of the CommonBehaviorFactory for EUML2.
 */
class CommonBehaviorFactoryEUMLImpl implements CommonBehaviorFactory,
        AbstractModelFactory {

    /**
     * The model implementation.
     */
    private EUMLModelImplementation modelImpl;

    /**
     * Constructor.
     *
     * @param implementation The ModelImplementation.
     */
    public CommonBehaviorFactoryEUMLImpl(EUMLModelImplementation implementation) {
        modelImpl = implementation;
    }

    public Object buildAction(Object message) {
        System.out.println("SATD ID: 700");
        return null;
    }

    public Object buildCallAction(Object oper, String name) {
        System.out.println("SATD ID: 663");
        return null;
    }

    public Object buildLink(Object fromInstance, Object toInstance) {
        System.out.println("SATD ID: 1143");
        return null;
    }

    public Object buildReception(Object aClassifier) {
        System.out.println("SATD ID: 525");
        return null;
    }

    public Object buildSignal(Object element) {
        System.out.println("SATD ID: 837");
        return null;
    }

    public Object buildStimulus(Object link) {
        System.out.println("SATD ID: 813");
        return null;
    }

    public Object buildUninterpretedAction(Object actionState) {
        System.out.println("SATD ID: 367");
        return null;
    }

    public Object createActionSequence() {
        System.out.println("SATD ID: 639");
        return null;
    }

    public Object createArgument() {
        System.out.println("SATD ID: 71");
        return null;
    }

    public Object createAttributeLink() {
        System.out.println("SATD ID: 355");
        return null;
    }

    public Object createCallAction() {

        System.out.println("SATD ID: 1041");
        return null;
    }

    public Object createComponentInstance() {
        System.out.println("SATD ID: 173");
        return null;
    }

    public Object createCreateAction() {
        return UMLFactory.eINSTANCE.createCreateObjectAction();
    }

    public Object createDataValue() {
        System.out.println("SATD ID: 524");
        return null;
    }

    public Object createDestroyAction() {
        return UMLFactory.eINSTANCE.createDestroyObjectAction();
    }

    public Object createException() {
        System.out.println("SATD ID: 707");
        return null;
    }

    public Object createLink() {
        System.out.println("SATD ID: 369");
        return null;
    }

    public Object createLinkEnd() {
        System.out.println("SATD ID: 296");
        return null;
    }

    public Object createLinkObject() {
        System.out.println("SATD ID: 808");
        return null;
    }

    public Object createNodeInstance() {
        System.out.println("SATD ID: 406");
        return null;
    }

    public Object createObject() {
        System.out.println("SATD ID: 248");
        return null;
    }

    public Object createReception() {
        return UMLFactory.eINSTANCE.createReception();
    }

    public Object createReturnAction() {
        System.out.println("SATD ID: 490");
        return null;
    }

    public Object createSendAction() {
        return UMLFactory.eINSTANCE.createSendObjectAction();
    }

    public Signal createSignal() {
        return UMLFactory.eINSTANCE.createSignal();
    }

    public Object createStimulus() {
        System.out.println("SATD ID: 447");
        return null;
    }

    public Object createSubsystemInstance() {
        System.out.println("SATD ID: 941");
        return null;
    }

    public Object createTerminateAction() {
        System.out.println("SATD ID: 73");
        return null;
    }

    public OpaqueAction createUninterpretedAction() {
        System.out.println("SATD ID: 511");
        return null;
    }


}
