/**
 * Generated with Acceleo
 */
package org.wso2.integrationstudio.gmf.esb.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EEFFeatureEditorDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.jface.window.Window;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import org.wso2.integrationstudio.gmf.esb.EsbPackage;

import org.wso2.integrationstudio.gmf.esb.parts.EsbViewsRepository;
import org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart;

import org.wso2.integrationstudio.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class LoadBalanceEndPointPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, LoadBalanceEndPointPropertiesEditionPart {

	protected Text description;
	protected Text commentsList;
	protected Button editCommentsList;
	protected EList commentsListList;
	protected Text endPointName;
	protected Button anonymous;
	protected Button inLine;
	protected Button duplicate;
	protected ReferencesTable properties;
	protected List<ViewerFilter> propertiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> propertiesFilters = new ArrayList<ViewerFilter>();
	protected Button reversed;
	protected ReferencesTable children;
	protected List<ViewerFilter> childrenBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> childrenFilters = new ArrayList<ViewerFilter>();
	protected Text name;
	protected Button failover;
	protected Text policy;
	protected ReferencesTable outputConnector;
	protected List<ViewerFilter> outputConnectorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outputConnectorFilters = new ArrayList<ViewerFilter>();
	protected EMFComboViewer sessionType;
	protected Text algorithm;
	protected Text sessionTimeout;
	protected Button buildMessage;
	protected ReferencesTable members;
	protected List<ViewerFilter> membersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> membersFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public LoadBalanceEndPointPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence loadBalanceEndPointStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = loadBalanceEndPointStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.class);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.description);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.commentsList);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.endPointName);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.anonymous);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.inLine);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.duplicate);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.reversed);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.children);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.name);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.failover);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.policy);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionType);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.algorithm);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionTimeout);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.buildMessage);
		propertiesStep.addStep(EsbViewsRepository.LoadBalanceEndPoint.Properties.members);
		
		
		composer = new PartComposer(loadBalanceEndPointStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.commentsList) {
					return createCommentsListMultiValuedEditor(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.endPointName) {
					return createEndPointNameText(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.anonymous) {
					return createAnonymousCheckbox(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.inLine) {
					return createInLineCheckbox(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.duplicate) {
					return createDuplicateCheckbox(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_) {
					return createPropertiesAdvancedTableComposition(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.reversed) {
					return createReversedCheckbox(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.children) {
					return createChildrenAdvancedTableComposition(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.name) {
					return createNameText(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.failover) {
					return createFailoverCheckbox(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.policy) {
					return createPolicyText(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector) {
					return createOutputConnectorAdvancedTableComposition(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionType) {
					return createSessionTypeEMFComboViewer(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.algorithm) {
					return createAlgorithmText(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionTimeout) {
					return createSessionTimeoutText(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.buildMessage) {
					return createBuildMessageCheckbox(parent);
				}
				if (key == EsbViewsRepository.LoadBalanceEndPoint.Properties.members) {
					return createMembersAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(EsbMessages.LoadBalanceEndPointPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, EsbViewsRepository.LoadBalanceEndPoint.Properties.description, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, EsbViewsRepository.LoadBalanceEndPoint.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.description, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDescriptionText

		// End of user code
		return parent;
	}

	protected Composite createCommentsListMultiValuedEditor(Composite parent) {
		commentsList = SWTUtils.createScrollableText(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData commentsListData = new GridData(GridData.FILL_HORIZONTAL);
		commentsListData.horizontalSpan = 2;
		commentsList.setLayoutData(commentsListData);
		EditingUtils.setID(commentsList, EsbViewsRepository.LoadBalanceEndPoint.Properties.commentsList);
		EditingUtils.setEEFtype(commentsList, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editCommentsList = new Button(parent, SWT.NONE);
		editCommentsList.setText(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.commentsList, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_CommentsListLabel));
		GridData editCommentsListData = new GridData();
		editCommentsList.setLayoutData(editCommentsListData);
		editCommentsList.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EEFFeatureEditorDialog dialog = new EEFFeatureEditorDialog(
						commentsList.getShell(), "LoadBalanceEndPoint", new AdapterFactoryLabelProvider(adapterFactory), //$NON-NLS-1$
						commentsListList, EsbPackage.eINSTANCE.getEsbElement_CommentsList().getEType(), null,
						false, true, 
						null, null);
				if (dialog.open() == Window.OK) {
					commentsListList = dialog.getResult();
					if (commentsListList == null) {
						commentsListList = new BasicEList();
					}
					commentsList.setText(commentsListList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.commentsList, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new BasicEList(commentsListList)));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editCommentsList, EsbViewsRepository.LoadBalanceEndPoint.Properties.commentsList);
		EditingUtils.setEEFtype(editCommentsList, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
		// Start of user code for createCommentsListMultiValuedEditor

		// End of user code
		return parent;
	}

	
	protected Composite createEndPointNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.LoadBalanceEndPoint.Properties.endPointName, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_EndPointNameLabel);
		endPointName = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData endPointNameData = new GridData(GridData.FILL_HORIZONTAL);
		endPointName.setLayoutData(endPointNameData);
		endPointName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.endPointName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endPointName.getText()));
			}

		});
		endPointName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.endPointName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, endPointName.getText()));
				}
			}

		});
		EditingUtils.setID(endPointName, EsbViewsRepository.LoadBalanceEndPoint.Properties.endPointName);
		EditingUtils.setEEFtype(endPointName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.endPointName, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createEndPointNameText

		// End of user code
		return parent;
	}

	
	protected Composite createAnonymousCheckbox(Composite parent) {
		anonymous = new Button(parent, SWT.CHECK);
		anonymous.setText(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.anonymous, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_AnonymousLabel));
		anonymous.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.anonymous, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(anonymous.getSelection())));
			}

		});
		GridData anonymousData = new GridData(GridData.FILL_HORIZONTAL);
		anonymousData.horizontalSpan = 2;
		anonymous.setLayoutData(anonymousData);
		EditingUtils.setID(anonymous, EsbViewsRepository.LoadBalanceEndPoint.Properties.anonymous);
		EditingUtils.setEEFtype(anonymous, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.anonymous, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAnonymousCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createInLineCheckbox(Composite parent) {
		inLine = new Button(parent, SWT.CHECK);
		inLine.setText(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.inLine, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_InLineLabel));
		inLine.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.inLine, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(inLine.getSelection())));
			}

		});
		GridData inLineData = new GridData(GridData.FILL_HORIZONTAL);
		inLineData.horizontalSpan = 2;
		inLine.setLayoutData(inLineData);
		EditingUtils.setID(inLine, EsbViewsRepository.LoadBalanceEndPoint.Properties.inLine);
		EditingUtils.setEEFtype(inLine, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.inLine, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createInLineCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createDuplicateCheckbox(Composite parent) {
		duplicate = new Button(parent, SWT.CHECK);
		duplicate.setText(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.duplicate, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_DuplicateLabel));
		duplicate.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.duplicate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(duplicate.getSelection())));
			}

		});
		GridData duplicateData = new GridData(GridData.FILL_HORIZONTAL);
		duplicateData.horizontalSpan = 2;
		duplicate.setLayoutData(duplicateData);
		EditingUtils.setID(duplicate, EsbViewsRepository.LoadBalanceEndPoint.Properties.duplicate);
		EditingUtils.setEEFtype(duplicate, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.duplicate, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createDuplicateCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createPropertiesAdvancedTableComposition(Composite parent) {
		this.properties = new ReferencesTable(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_PropertiesLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				properties.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				properties.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				properties.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				properties.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.propertiesFilters) {
			this.properties.addFilter(filter);
		}
		this.properties.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_, EsbViewsRepository.SWT_KIND));
		this.properties.createControls(parent);
		this.properties.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData propertiesData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesData.horizontalSpan = 3;
		this.properties.setLayoutData(propertiesData);
		this.properties.setLowerBound(0);
		this.properties.setUpperBound(-1);
		properties.setID(EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_);
		properties.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createPropertiesAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createReversedCheckbox(Composite parent) {
		reversed = new Button(parent, SWT.CHECK);
		reversed.setText(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.reversed, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_ReversedLabel));
		reversed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.reversed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(reversed.getSelection())));
			}

		});
		GridData reversedData = new GridData(GridData.FILL_HORIZONTAL);
		reversedData.horizontalSpan = 2;
		reversed.setLayoutData(reversedData);
		EditingUtils.setID(reversed, EsbViewsRepository.LoadBalanceEndPoint.Properties.reversed);
		EditingUtils.setEEFtype(reversed, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.reversed, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createReversedCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createChildrenAdvancedTableComposition(Composite parent) {
		this.children = new ReferencesTable(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.children, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_ChildrenLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.children, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				children.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.children, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				children.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.children, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				children.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.children, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				children.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.childrenFilters) {
			this.children.addFilter(filter);
		}
		this.children.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.children, EsbViewsRepository.SWT_KIND));
		this.children.createControls(parent);
		this.children.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.children, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData childrenData = new GridData(GridData.FILL_HORIZONTAL);
		childrenData.horizontalSpan = 3;
		this.children.setLayoutData(childrenData);
		this.children.setLowerBound(0);
		this.children.setUpperBound(-1);
		children.setID(EsbViewsRepository.LoadBalanceEndPoint.Properties.children);
		children.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createChildrenAdvancedTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, EsbViewsRepository.LoadBalanceEndPoint.Properties.name, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, EsbViewsRepository.LoadBalanceEndPoint.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.name, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createFailoverCheckbox(Composite parent) {
		failover = new Button(parent, SWT.CHECK);
		failover.setText(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.failover, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_FailoverLabel));
		failover.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.failover, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(failover.getSelection())));
			}

		});
		GridData failoverData = new GridData(GridData.FILL_HORIZONTAL);
		failoverData.horizontalSpan = 2;
		failover.setLayoutData(failoverData);
		EditingUtils.setID(failover, EsbViewsRepository.LoadBalanceEndPoint.Properties.failover);
		EditingUtils.setEEFtype(failover, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.failover, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFailoverCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createPolicyText(Composite parent) {
		createDescription(parent, EsbViewsRepository.LoadBalanceEndPoint.Properties.policy, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_PolicyLabel);
		policy = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData policyData = new GridData(GridData.FILL_HORIZONTAL);
		policy.setLayoutData(policyData);
		policy.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.policy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, policy.getText()));
			}

		});
		policy.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.policy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, policy.getText()));
				}
			}

		});
		EditingUtils.setID(policy, EsbViewsRepository.LoadBalanceEndPoint.Properties.policy);
		EditingUtils.setEEFtype(policy, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.policy, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createPolicyText

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createOutputConnectorAdvancedTableComposition(Composite parent) {
		this.outputConnector = new ReferencesTable(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_OutputConnectorLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				outputConnector.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				outputConnector.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				outputConnector.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				outputConnector.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.outputConnectorFilters) {
			this.outputConnector.addFilter(filter);
		}
		this.outputConnector.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector, EsbViewsRepository.SWT_KIND));
		this.outputConnector.createControls(parent);
		this.outputConnector.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outputConnectorData = new GridData(GridData.FILL_HORIZONTAL);
		outputConnectorData.horizontalSpan = 3;
		this.outputConnector.setLayoutData(outputConnectorData);
		this.outputConnector.setLowerBound(0);
		this.outputConnector.setUpperBound(-1);
		outputConnector.setID(EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector);
		outputConnector.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createOutputConnectorAdvancedTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @generated NOT
	 */
	protected Composite createSessionTypeEMFComboViewer(Composite parent) {
		createDescription(parent, EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionType, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_SessionTypeLabel);
		sessionType = new EMFComboViewer(parent);
		sessionType.setContentProvider(new ArrayContentProvider());
		sessionType.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData sessionTypeData = new GridData(GridData.FILL_HORIZONTAL);
		sessionType.getCombo().setLayoutData(sessionTypeData);
                sessionType.getCombo().addListener(SWT.MouseVerticalWheel, new Listener() {

                    @Override
                    public void handleEvent(Event arg0) {
                        arg0.doit = false;
                    }
                });
		sessionType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSessionType()));
			}

		});
		sessionType.setID(EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionType);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionType, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSessionTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createAlgorithmText(Composite parent) {
		createDescription(parent, EsbViewsRepository.LoadBalanceEndPoint.Properties.algorithm, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_AlgorithmLabel);
		algorithm = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData algorithmData = new GridData(GridData.FILL_HORIZONTAL);
		algorithm.setLayoutData(algorithmData);
		algorithm.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.algorithm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, algorithm.getText()));
			}

		});
		algorithm.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.algorithm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, algorithm.getText()));
				}
			}

		});
		EditingUtils.setID(algorithm, EsbViewsRepository.LoadBalanceEndPoint.Properties.algorithm);
		EditingUtils.setEEFtype(algorithm, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.algorithm, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createAlgorithmText

		// End of user code
		return parent;
	}

	
	protected Composite createSessionTimeoutText(Composite parent) {
		createDescription(parent, EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionTimeout, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_SessionTimeoutLabel);
		sessionTimeout = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData sessionTimeoutData = new GridData(GridData.FILL_HORIZONTAL);
		sessionTimeout.setLayoutData(sessionTimeoutData);
		sessionTimeout.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sessionTimeout.getText()));
			}

		});
		sessionTimeout.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionTimeout, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, sessionTimeout.getText()));
				}
			}

		});
		EditingUtils.setID(sessionTimeout, EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionTimeout);
		EditingUtils.setEEFtype(sessionTimeout, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionTimeout, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createSessionTimeoutText

		// End of user code
		return parent;
	}

	
	protected Composite createBuildMessageCheckbox(Composite parent) {
		buildMessage = new Button(parent, SWT.CHECK);
		buildMessage.setText(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.buildMessage, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_BuildMessageLabel));
		buildMessage.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.buildMessage, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(buildMessage.getSelection())));
			}

		});
		GridData buildMessageData = new GridData(GridData.FILL_HORIZONTAL);
		buildMessageData.horizontalSpan = 2;
		buildMessage.setLayoutData(buildMessageData);
		EditingUtils.setID(buildMessage, EsbViewsRepository.LoadBalanceEndPoint.Properties.buildMessage);
		EditingUtils.setEEFtype(buildMessage, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.buildMessage, EsbViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBuildMessageCheckbox

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createMembersAdvancedTableComposition(Composite parent) {
		this.members = new ReferencesTable(getDescription(EsbViewsRepository.LoadBalanceEndPoint.Properties.members, EsbMessages.LoadBalanceEndPointPropertiesEditionPart_MembersLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.members, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				members.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.members, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				members.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.members, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				members.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.members, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				members.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.membersFilters) {
			this.members.addFilter(filter);
		}
		this.members.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.LoadBalanceEndPoint.Properties.members, EsbViewsRepository.SWT_KIND));
		this.members.createControls(parent);
		this.members.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(LoadBalanceEndPointPropertiesEditionPartImpl.this, EsbViewsRepository.LoadBalanceEndPoint.Properties.members, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData membersData = new GridData(GridData.FILL_HORIZONTAL);
		membersData.horizontalSpan = 3;
		this.members.setLayoutData(membersData);
		this.members.setLowerBound(0);
		this.members.setUpperBound(-1);
		members.setID(EsbViewsRepository.LoadBalanceEndPoint.Properties.members);
		members.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createMembersAdvancedTableComposition

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.description);
		if (eefElementEditorReadOnlyState && description.isEnabled()) {
			description.setEnabled(false);
			description.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !description.isEnabled()) {
			description.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getCommentsList()
	 * 
	 */
	public EList getCommentsList() {
		return commentsListList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setCommentsList(EList newValue)
	 * 
	 */
	public void setCommentsList(EList newValue) {
		commentsListList = newValue;
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.commentsList);
		if (eefElementEditorReadOnlyState && commentsList.isEnabled()) {
			commentsList.setEnabled(false);
			commentsList.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !commentsList.isEnabled()) {
			commentsList.setEnabled(true);
		}	
		
	}

	public void addToCommentsList(Object newValue) {
		commentsListList.add(newValue);
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
	}

	public void removeToCommentsList(Object newValue) {
		commentsListList.remove(newValue);
		if (newValue != null) {
			commentsList.setText(commentsListList.toString());
		} else {
			commentsList.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getEndPointName()
	 * 
	 */
	public String getEndPointName() {
		return endPointName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setEndPointName(String newValue)
	 * 
	 */
	public void setEndPointName(String newValue) {
		if (newValue != null) {
			endPointName.setText(newValue);
		} else {
			endPointName.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.endPointName);
		if (eefElementEditorReadOnlyState && endPointName.isEnabled()) {
			endPointName.setEnabled(false);
			endPointName.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !endPointName.isEnabled()) {
			endPointName.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getAnonymous()
	 * 
	 */
	public Boolean getAnonymous() {
		return Boolean.valueOf(anonymous.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setAnonymous(Boolean newValue)
	 * 
	 */
	public void setAnonymous(Boolean newValue) {
		if (newValue != null) {
			anonymous.setSelection(newValue.booleanValue());
		} else {
			anonymous.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.anonymous);
		if (eefElementEditorReadOnlyState && anonymous.isEnabled()) {
			anonymous.setEnabled(false);
			anonymous.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !anonymous.isEnabled()) {
			anonymous.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getInLine()
	 * 
	 */
	public Boolean getInLine() {
		return Boolean.valueOf(inLine.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setInLine(Boolean newValue)
	 * 
	 */
	public void setInLine(Boolean newValue) {
		if (newValue != null) {
			inLine.setSelection(newValue.booleanValue());
		} else {
			inLine.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.inLine);
		if (eefElementEditorReadOnlyState && inLine.isEnabled()) {
			inLine.setEnabled(false);
			inLine.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inLine.isEnabled()) {
			inLine.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getDuplicate()
	 * 
	 */
	public Boolean getDuplicate() {
		return Boolean.valueOf(duplicate.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setDuplicate(Boolean newValue)
	 * 
	 */
	public void setDuplicate(Boolean newValue) {
		if (newValue != null) {
			duplicate.setSelection(newValue.booleanValue());
		} else {
			duplicate.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.duplicate);
		if (eefElementEditorReadOnlyState && duplicate.isEnabled()) {
			duplicate.setEnabled(false);
			duplicate.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !duplicate.isEnabled()) {
			duplicate.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#initProperties(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initProperties(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		properties.setContentProvider(contentProvider);
		properties.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.properties_);
		if (eefElementEditorReadOnlyState && properties.isEnabled()) {
			properties.setEnabled(false);
			properties.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !properties.isEnabled()) {
			properties.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#updateProperties()
	 * 
	 */
	public void updateProperties() {
	properties.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#addFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProperties(ViewerFilter filter) {
		propertiesFilters.add(filter);
		if (this.properties != null) {
			this.properties.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#addBusinessFilterProperties(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProperties(ViewerFilter filter) {
		propertiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#isContainedInPropertiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInPropertiesTable(EObject element) {
		return ((ReferencesTableSettings)properties.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getReversed()
	 * 
	 */
	public Boolean getReversed() {
		return Boolean.valueOf(reversed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setReversed(Boolean newValue)
	 * 
	 */
	public void setReversed(Boolean newValue) {
		if (newValue != null) {
			reversed.setSelection(newValue.booleanValue());
		} else {
			reversed.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.reversed);
		if (eefElementEditorReadOnlyState && reversed.isEnabled()) {
			reversed.setEnabled(false);
			reversed.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !reversed.isEnabled()) {
			reversed.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#initChildren(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initChildren(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		children.setContentProvider(contentProvider);
		children.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.children);
		if (eefElementEditorReadOnlyState && children.isEnabled()) {
			children.setEnabled(false);
			children.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !children.isEnabled()) {
			children.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#updateChildren()
	 * 
	 */
	public void updateChildren() {
	children.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#addFilterChildren(ViewerFilter filter)
	 * 
	 */
	public void addFilterToChildren(ViewerFilter filter) {
		childrenFilters.add(filter);
		if (this.children != null) {
			this.children.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#addBusinessFilterChildren(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToChildren(ViewerFilter filter) {
		childrenBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#isContainedInChildrenTable(EObject element)
	 * 
	 */
	public boolean isContainedInChildrenTable(EObject element) {
		return ((ReferencesTableSettings)children.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getFailover()
	 * 
	 */
	public Boolean getFailover() {
		return Boolean.valueOf(failover.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setFailover(Boolean newValue)
	 * 
	 */
	public void setFailover(Boolean newValue) {
		if (newValue != null) {
			failover.setSelection(newValue.booleanValue());
		} else {
			failover.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.failover);
		if (eefElementEditorReadOnlyState && failover.isEnabled()) {
			failover.setEnabled(false);
			failover.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !failover.isEnabled()) {
			failover.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getPolicy()
	 * 
	 */
	public String getPolicy() {
		return policy.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setPolicy(String newValue)
	 * 
	 */
	public void setPolicy(String newValue) {
		if (newValue != null) {
			policy.setText(newValue);
		} else {
			policy.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.policy);
		if (eefElementEditorReadOnlyState && policy.isEnabled()) {
			policy.setEnabled(false);
			policy.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !policy.isEnabled()) {
			policy.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#initOutputConnector(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initOutputConnector(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outputConnector.setContentProvider(contentProvider);
		outputConnector.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.outputConnector);
		if (eefElementEditorReadOnlyState && outputConnector.isEnabled()) {
			outputConnector.setEnabled(false);
			outputConnector.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !outputConnector.isEnabled()) {
			outputConnector.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#updateOutputConnector()
	 * 
	 */
	public void updateOutputConnector() {
	outputConnector.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#addFilterOutputConnector(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutputConnector(ViewerFilter filter) {
		outputConnectorFilters.add(filter);
		if (this.outputConnector != null) {
			this.outputConnector.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#addBusinessFilterOutputConnector(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutputConnector(ViewerFilter filter) {
		outputConnectorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#isContainedInOutputConnectorTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutputConnectorTable(EObject element) {
		return ((ReferencesTableSettings)outputConnector.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getSessionType()
	 * 
	 */
	public Enumerator getSessionType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) sessionType.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#initSessionType(Object input, Enumerator current)
	 */
	public void initSessionType(Object input, Enumerator current) {
		sessionType.setInput(input);
		sessionType.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionType);
		if (eefElementEditorReadOnlyState && sessionType.isEnabled()) {
			sessionType.setEnabled(false);
			sessionType.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sessionType.isEnabled()) {
			sessionType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setSessionType(Enumerator newValue)
	 * 
	 */
	public void setSessionType(Enumerator newValue) {
		sessionType.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionType);
		if (eefElementEditorReadOnlyState && sessionType.isEnabled()) {
			sessionType.setEnabled(false);
			sessionType.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sessionType.isEnabled()) {
			sessionType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getAlgorithm()
	 * 
	 */
	public String getAlgorithm() {
		return algorithm.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setAlgorithm(String newValue)
	 * 
	 */
	public void setAlgorithm(String newValue) {
		if (newValue != null) {
			algorithm.setText(newValue);
		} else {
			algorithm.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.algorithm);
		if (eefElementEditorReadOnlyState && algorithm.isEnabled()) {
			algorithm.setEnabled(false);
			algorithm.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !algorithm.isEnabled()) {
			algorithm.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getSessionTimeout()
	 * 
	 */
	public String getSessionTimeout() {
		return sessionTimeout.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setSessionTimeout(String newValue)
	 * 
	 */
	public void setSessionTimeout(String newValue) {
		if (newValue != null) {
			sessionTimeout.setText(newValue);
		} else {
			sessionTimeout.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.sessionTimeout);
		if (eefElementEditorReadOnlyState && sessionTimeout.isEnabled()) {
			sessionTimeout.setEnabled(false);
			sessionTimeout.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !sessionTimeout.isEnabled()) {
			sessionTimeout.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#getBuildMessage()
	 * 
	 */
	public Boolean getBuildMessage() {
		return Boolean.valueOf(buildMessage.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#setBuildMessage(Boolean newValue)
	 * 
	 */
	public void setBuildMessage(Boolean newValue) {
		if (newValue != null) {
			buildMessage.setSelection(newValue.booleanValue());
		} else {
			buildMessage.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.buildMessage);
		if (eefElementEditorReadOnlyState && buildMessage.isEnabled()) {
			buildMessage.setEnabled(false);
			buildMessage.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !buildMessage.isEnabled()) {
			buildMessage.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#initMembers(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initMembers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		members.setContentProvider(contentProvider);
		members.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.LoadBalanceEndPoint.Properties.members);
		if (eefElementEditorReadOnlyState && members.isEnabled()) {
			members.setEnabled(false);
			members.setToolTipText(EsbMessages.LoadBalanceEndPoint_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !members.isEnabled()) {
			members.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#updateMembers()
	 * 
	 */
	public void updateMembers() {
	members.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#addFilterMembers(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMembers(ViewerFilter filter) {
		membersFilters.add(filter);
		if (this.members != null) {
			this.members.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#addBusinessFilterMembers(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMembers(ViewerFilter filter) {
		membersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.LoadBalanceEndPointPropertiesEditionPart#isContainedInMembersTable(EObject element)
	 * 
	 */
	public boolean isContainedInMembersTable(EObject element) {
		return ((ReferencesTableSettings)members.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.LoadBalanceEndPoint_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
