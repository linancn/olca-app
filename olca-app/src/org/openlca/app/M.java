package org.openlca.app;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.eclipse.osgi.util.NLS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

public class M extends NLS {

	public static String AboutOpenLCA;
	public static String ALocationCodeIsRequired;
	public static String AccessAndUseRestrictions;
	public static String Active;
	public static String ActivityQuantity;
	public static String ActivityUnit;
	public static String ActivityVariable;
	public static String Actor;
	public static String Actors;
	public static String Add;
	public static String AddIndicator;
	public static String AddNewChildCategory;
	public static String AddNewRepository;
	public static String AddScore;
	public static String AddSection;
	public static String AddToMethodParameters;
	public static String AddedValue;
	public static String AdditionalInformation;
	public static String Address;
	public static String AdministrativeInformation;
	public static String Aggregation;
	public static String AggregationType;
	public static String Allocation;
	public static String AllocationFactors;
	public static String AllocationMethod;
	public static String AlreadyConnected;
	public static String AlreadyPresent;
	public static String Amount;
	public static String Analysis;
	public static String AnalysisResultOf;
	public static String AnalyzingForProblems;
	public static String ApplyFormat;
	public static String ApplyingDatabaseUpdates;
	public static String AreYouSureYouWantToCheckout;
	public static String ArithmeticMean;
	public static String AsDefinedInProcesses;
	public static String AssessDataQuality;
	public static String AssignUnits;
	public static String Author;
	public static String AutoLinkProcesses;
	public static String AvoidedProduct;
	public static String AvoidedProductFlow;
	public static String AvoidedWaste;
	public static String AvoidedWasteFlow;
	public static String BackgroundData;
	public static String BackupDatabase;
	public static String BaseUncertainty;
	public static String Both;
	public static String Browse;
	public static String BrowseLocalFiles;
	public static String BuildNextTier;
	public static String BuildSupplyChain;
	public static String Bulkreplace;
	public static String BulkreplaceFlows;
	public static String BulkreplaceProviders;

	// C
	public static String CASNumber;
	public static String CSVFormat;
	public static String Calculate;
	public static String CalculateCosts;
	public static String CalculateDefaultValues;
	public static String CalculateResults;
	public static String CalculateStatistics;
	public static String CalculationProperties;
	public static String CalculationType;
	public static String CalculationWizardDescription;
	public static String CanNotSaveParameter;
	public static String Cancel;
	public static String CannotDelete;
	public static String CannotDeleteFlowProperty;
	public static String CannotDeleteMessage;
	public static String CannotDeleteRefFlow;
	public static String CannotDeleteRefFlowMessage;
	public static String CannotDeleteReferenceFlowProperty;
	public static String CannotDeleteReferenceUnit;
	public static String CannotDeleteUnit;
	public static String CannotRemoveExchanges;
	public static String Category;
	public static String CategoryNotEmpty;
	public static String Causal;
	public static String CausalAllocation;
	public static String Change;
	public static String ChangesToBeFetched;
	public static String CheckAgainstLibraries;
	public static String CheckLinkingProperties;
	public static String CheckingAgainstLibraries;
	public static String CheckingOutCommit;
	public static String Checkout;
	public static String ChooseDirectory;
	public static String City;
	public static String Clear;
	public static String ClearData;
	public static String ClickHereToChangeDisplay;
	public static String Close;
	public static String CloseAll;
	public static String CloseDatabase;
	public static String Code;
	public static String Collapse;
	public static String CollapseAll;
	public static String ColumnSeparator;
	public static String Comma;
	public static String Comment;
	public static String Comments;
	public static String Commit;
	public static String CommitChangesToRepository;
	public static String CommitDate;
	public static String CommitError;
	public static String CommitMessage;
	public static String CommitReferenceNotice;
	public static String CommitingChanges;
	public static String Committer;
	public static String Compare;
	public static String CompareWith;
	public static String ComparingWithRepository;
	public static String Complete;
	public static String CompleteReferenceData;
	public static String Component;
	public static String Compress;
	public static String CompressDatabase;
	public static String CompressingDatabase;
	public static String Configuration;
	public static String ConfigureEcospoldMessage;
	public static String ConfigureRepositories;
	public static String Connect;
	public static String ConnectProviders;
	public static String ConnectRecipients;
	public static String ConnectingToRepository;
	public static String Connection;
	public static String ConnectionFailed;
	public static String ConnectionWithAnonymousAccess;
	public static String ConsumedBy;
	public static String Content;
	public static String Context;
	public static String Contribution;
	public static String ContributionTree;
	public static String ContributionTreeLocations;
	public static String ConversionFactor;
	public static String Copy;
	public static String CopyAllFromRightToLeft;
	public static String CopyMetaDataFromReferenceProcess;
	public static String CopySelectionFromRightToLeft;
	public static String Copyright;
	public static String CostCategory;
	public static String CostFormula;
	public static String CostResult;
	public static String CostValue;
	public static String Costs;
	public static String CostsPerUnit;
	public static String CostsRevenues;
	public static String CouldNotAllocateMemoryError;
	public static String CouldNotConnect;
	public static String CouldNotFindKMLData;
	public static String CouldNotOpenDatabase;
	public static String CouldNotOverwriteFile;
	public static String Country;
	public static String Coverage;
	public static String CreateANewDatabase;
	public static String CreateANewFlowForTheProcess;
	public static String CreateANewProductFlowForTheProcess;
	public static String CreateAWasteTreatmentProcess;
	public static String CreateDatabase;
	public static String CreateDefaultValuesForMissingFields;
	public static String CreateNew;
	public static String CreateProcess;
	public static String CreateProcesslink;
	public static String CreateProductSystem;
	public static String CreatesANewActor;
	public static String CreatesANewDataQualitySystem;
	public static String CreatesANewFlow;
	public static String CreatesANewFlowProperty;
	public static String CreatesANewImpactMethod;
	public static String CreatesANewLocation;
	public static String CreatesANewParameter;
	public static String CreatesANewProductSystem;
	public static String CreatesANewProject;
	public static String CreatesANewSource;
	public static String CreatesANewUnitGroup;
	public static String CreatingEcoSpoldFolder;
	public static String CreatingProductSystem;
	public static String CreationDate;
	public static String Currencies;
	public static String Currency;
	public static String CurrencyCode;
	public static String Cut;
	public static String Cutoff;

	// D
	public static String DBImportNoTarget;
	public static String DBImportNoTargetConnectionFailedMessage;
	public static String DBImportUpdateDatabaseQuestion;
	public static String DBImportVersionNewerMessage;
	public static String DataCollectionPeriod;
	public static String DataCompleteness;
	public static String DataDocumentor;
	public static String DataGenerator;
	public static String DataQuality;
	public static String DataQualityEntry;
	public static String DataQualityProperties;
	public static String DataQualitySystem;
	public static String DataQualitySystems;
	public static String DataSelection;
	public static String DataSet;
	public static String DataSetOtherEvaluation;
	public static String DataSetOwner;
	public static String DataSets;
	public static String DataSourceInformation;
	public static String DataTreatment;
	public static String Database;
	public static String DatabaseContent;
	public static String DatabaseImport;
	public static String DatabaseImportDescription;
	public static String DatabaseName;
	public static String DatabaseNeedsUpdate;
	public static String DatabaseRenameError;
	public static String DatabaseType;
	public static String DatabaseValidationCompleteNoErrorsWereFound;
	public static String DatabaseVersionCheckFailed;
	public static String DatabaseWasExportedToFile;
	public static String DecimalSeparator;
	public static String DefaultFlowProperty;
	public static String DefaultMethod;
	public static String DefaultProvider;
	public static String Delete;
	public static String DeleteCategoryQuestion;
	public static String DeleteDatabase;
	public static String DeleteFile;
	public static String DeleteLocalModel;
	public static String DeleteProcess;
	public static String DeleteProcesslink;
	public static String DeleteReportSectionQuestion;
	public static String DeleteSection;
	public static String DeleteShapeFile;
	public static String DependenantParameter;
	public static String DependentParameter;
	public static String DependentParameters;
	public static String Description;
	public static String DeveloperTools;
	public static String Diff;
	public static String Direct;
	public static String DirectContribution;
	public static String DirectContributionsFlowResultsOverview;
	public static String DirectContributionsImpactCategoryResultsOverview;
	public static String Direction;
	public static String Disabled;
	public static String DiscardLocalChanges;
	public static String DisconnectFromRepository;
	public static String Display;
	public static String DontShowSmallerThen;
	public static String DoNotShowThisMessageAgain;
	public static String DoYouReallyWantToDelete;
	public static String Dot;
	public static String DownloadingData;

	// E
	public static String EcoSpold2Export;
	public static String EcoSpoldConfiguration;
	public static String Economic;
	public static String Edit;
	public static String ElementaryFlow;
	public static String Email;
	public static String EmptyDatabase;
	public static String EmptyValueMessage;
	public static String EnableCollaboration;
	public static String EnableJblasLibrary;
	public static String EndDate;
	public static String EnterLocationNameAndCode;
	public static String EnterYourAuthenticatorToken;
	public static String Error;
	public static String ErrorPopupMessage;
	public static String ErrorPopupTitle;
	public static String Errors;
	public static String EstimatedTimeRemaining;
	public static String EvaluateAllFormulas;
	public static String EvaluateLocations;
	public static String EvaluatingLocations;
	public static String EvaluationSchema;
	public static String Example;
	public static String ExcelExport;
	public static String ExchangeDataQualitySchema;
	public static String ExchangesAreUsed;
	public static String ExcludeExchangesWithDefaultProviders;
	public static String ExcludeZeroEntries;
	public static String ExcludeZeroValues;
	public static String Exit;
	public static String Expand;
	public static String ExpandAll;
	public static String Export;
	public static String ExportAsMatrix;
	public static String ExportDataSets;
	public static String ExportDataSetsInOneFile;
	public static String ExportDatabase;
	public static String ExportDirectory;
	public static String ExportDone;
	public static String ExportEcoSpold;
	public static String ExportILCD;
	public static String ExportMatrix;
	public static String ExportProcess;
	public static String ExportReport;
	public static String ExportResults;
	public static String ExportResultsToExcel;
	public static String ExportToExcel;
	public static String ExportingProcesses;
	public static String ExternalFile;
	public static String ExternalSource;
	public static String ExternalSourceChange;
	public static String Factor;
	public static String Factors;
	public static String FailedToLoadFlowProperty;
	public static String Fetch;
	public static String FetchRemoteModel;
	public static String FetchingChanges;
	public static String FetchingCommits;
	public static String FetchingData;
	public static String File;
	public static String FileAlreadyExists;
	public static String FileDoesNotExist;
	public static String FileImportPage_Description;
	public static String Files;
	public static String Filter;
	public static String FilterByName;
	public static String Flow;
	public static String FlowContributions;
	public static String FlowContributionsToProcessResults;
	public static String FlowDataQualitySchema;
	public static String FlowDataQualityStatistics;
	public static String FlowProperties;
	public static String FlowProperty;
	public static String FlowPropertyIsUsed;
	public static String FlowPropertyType;
	public static String FlowSchema;
	public static String FlowType;
	public static String Flows;
	public static String Folder;
	public static String Formula;
	public static String FormulaEvaluationFailed;
	public static String FormulaInterpreter;
	public static String FoundProblems;
	public static String FromDirectory;
	public static String Function;
	public static String FunctionalUnit;
	public static String GeneralInformation;
	public static String Geography;
	public static String GeographyDescription;
	public static String GeometricMean;
	public static String GeometricMeanFormula;
	public static String GeometricStandardDeviation;
	public static String GeometricStandardDeviationFormula;
	public static String Geometry;
	public static String GeneralDatabaseProperties;
	public static String Generator;
	public static String Global;
	public static String GlobalParameter;
	public static String GlobalParameters;
	public static String Goal;
	public static String GoalAndScope;
	public static String Group;
	public static String Grouping;
	public static String Groups;
	public static String HEADRevision;
	public static String HTMLGraph;
	public static String HalfUp;
	public static String HasInventoryResult;
	public static String HasUncertainties;
	public static String Help;
	public static String Hide;
	public static String HideExecutedUpdates;
	public static String HighOpportunity;
	public static String HighRisk;
	public static String Home;
	public static String Host;
	public static String ILCDNetworkExport;
	public static String ILCDNetworkExportDescription;
	public static String ILCDNetworkSettings;
	public static String ILCDOtherSettings;
	public static String ILCD_AUTHENTICATION_FAILED_MSG;
	public static String ILCD_CONNECTION_FAILED_MSG;
	public static String ILCD_CONNECTION_WORKS_MSG;
	public static String ILCD_NO_READ_OR_WRITE_ACCESS_MSG;
	public static String ILCD_NetworkImport;
	public static String ILCD_RunImport;
	public static String ILCD_SearchFailedMessage;
	public static String ILCD_SearchPageDescription;
	public static String Id;
	public static String IgnoreDefaultProviders;
	public static String ImageExport;
	public static String ImpactAnalysis;
	public static String ImpactAssessmentMethod;
	public static String ImpactAssessmentMethods;
	public static String ImpactAssessmentResults;
	public static String ImpactCategories;
	public static String ImpactCategory;
	public static String ImpactFactor;
	public static String ImpactFactors;
	public static String ImpactResult;
	public static String Import;
	public static String ImportData;
	public static String ImportDatabase;
	public static String ImportEcoSpold;
	public static String ImportEcoSpold01DataSets;
	public static String ImportEcoSpold02DataSets;
	public static String ImportEcoSpoldGeographies;
	public static String ImportILCD;
	public static String ImportKMLGeographies;
	public static String ImportingKMLData;
	public static String ImportingXMLData;
	public static String IncludeCostCalculation;
	public static String IndexingDatasets;
	public static String Indicator;
	public static String IndicatorBarChart;
	public static String Indicators;
	public static String IndicatorsAndParameters;
	public static String IndicatorsScores;
	public static String Information;
	public static String InfrastructureFlow;
	public static String InfrastructureProcess;
	public static String Initializing;
	public static String Input;
	public static String InputOutput;
	public static String InputParameter;
	public static String InputParameters;
	public static String Inputs;
	public static String InputsOutputs;
	public static String IntendedApplication;
	public static String InterventionMatrix;
	public static String InvalidAllocationFactor;
	public static String InvalidAllocationFactorMessage;
	public static String InvalidFormula;
	public static String InvalidMemoryValue;
	public static String InvalidNumber;
	public static String InvalidParameterName;
	public static String InvalidValue;
	public static String Inventory;
	public static String InventoryResult;
	public static String InventoryResults;
	public static String IsDefault;
	public static String IsDefaultProvider;
	public static String IsInvalidFormula;
	public static String IsNotValidNumber;
	public static String IsNotValidParameterName;
	public static String IsReference;
	public static String KeepLocalModel;
	public static String KeepModelDeleted;
	public static String KmlEditor;
	public static String LCCAddedValuesTable;
	public static String LCCNetcostsTable;
	public static String LCIAMethod;
	public static String LCIMethod;
	public static String Label;
	public static String Language;
	public static String LastChange;
	public static String LastModificationDate;
	public static String Latitude;
	public static String Layout;
	public static String LayoutAs;
	public static String LciaCategoryDescriptionTable;
	public static String LCIAChecks;
	public static String LciaResultTable;
	public static String LibgfortanInfo;
	public static String Library;
	public static String LibraryDataSets;
	public static String Line;
	public static String LinkingProperties;
	public static String LoadingRepositoryList;
	public static String Local;
	public static String LocalDatabase;
	public static String LocalModel;
	public static String Location;
	public static String Locations;
	public static String LogFile;
	public static String LogNormalDistribution;
	public static String Longitude;
	public static String LowOpportunity;
	public static String LowRisk;

	// M
	public static String ManagePlugins;
	public static String Map;
	public static String MapCanNotBeDisplayed;
	public static String Mark;
	public static String MarkAsMerged;
	public static String MatrixExport;
	public static String MatrixFiles;
	public static String Maximize;
	public static String MaximizeAll;
	public static String Maximum;
	public static String MaximumFormula;
	public static String MaximumMemoryUsage;
	public static String Mean;
	public static String MeanFormula;
	public static String MediumOpportunity;
	public static String MediumRisk;
	public static String MemoryToHighMessage;
	public static String MemoryToLowMessage;
	public static String Message;
	public static String Methods;
	public static String MinimalTree;
	public static String Minimize;
	public static String MinimizeAll;
	public static String Minimum;
	public static String MinimumFormula;
	public static String Mode;
	public static String ModeFormula;
	public static String ModelGraph;
	public static String ModelType;
	public static String ModelingAndValidation;
	public static String ModelingConstants;
	public static String MonteCarloSimulation;
	public static String MoreThanXProcesses;
	public static String Move;
	public static String MoveDown;
	public static String MoveUp;
	public static String MultiLine;
	public static String MultiPoint;
	public static String MultiPolygon;

	// N
	public static String NaValueHandling;
	public static String Name;
	public static String NameCannotBeEmpty;
	public static String NameShouldBeDifferent;
	public static String NeedOpenDatabase;
	public static String NetCosts;
	public static String Netcosts;
	public static String NewActor;
	public static String NewCategory;
	public static String NewCurrency;
	public static String NewDataQualitySystem;
	public static String NewDatabase;
	public static String NewDatabase_AlreadyExists;
	public static String NewDatabase_InvalidName;
	public static String NewDatabase_NameToShort;
	public static String NewFlow;
	public static String NewFlowProperty;
	public static String NewImpactCategory;
	public static String NewImpactMethod;
	public static String NewLCIAMethod;
	public static String NewLocation;
	public static String NewParameter;
	public static String NewProcess;
	public static String NewProductSystem;
	public static String NewProject;
	public static String NewSection;
	public static String NewSocialIndicator;
	public static String NewSource;
	public static String NewUnitGroup;
	public static String No;
	public static String NoAccessToRepository;
	public static String NoAnalysisOptionsSet;
	public static String NoChangesInLocalDb;
	public static String NoData;
	public static String NoDatabaseOpened;
	public static String NoDescription;
	public static String NoDistribution;
	public static String NoExportFilesSelected;
	public static String NoOpportunity;
	public static String NoParameterSelected;
	public static String NoProjectVaraintsAreDefined;
	public static String NoQuantitativeReferenceSelected;
	public static String NoReferenceFlowPropertySelected;
	public static String NoReferenceProcessSelected;
	public static String NoReferenceSet;
	public static String NoRegionalizedInformation_Message;
	public static String NoRisk;
	public static String NoShapefileParameterSelected;
	public static String NoUnitGroupSelected;
	public static String None;
	public static String NormalDistribution;
	public static String NormalisationBarChart;
	public static String NormalisationRadarChart;
	public static String NormalisationResultTable;
	public static String Normalization;
	public static String NormalizationAndWeightingSet;
	public static String NormalizationFactor;
	public static String NormalizationWeighting;
	public static String NormalizationWeightingSets;
	public static String NotAnIntegerNumber;
	public static String NotApplicable;
	public static String Note;
	public static String NoteDefaultProviders;
	public static String Notification;
	public static String NumberFormatPage_Description;
	public static String NumberOfDecimalPlaces;
	public static String NumberOfIterations;
	public static String NumberOfSimulations;

	// O
	public static String OK;
	public static String OfProduct;
	public static String OnlineHelp;
	public static String OnlyLinkDefaultProviders;
	public static String Open;
	public static String OpenDatabase;
	public static String OpenEditor;
	public static String OpenFlow;
	public static String OpenInEditor;
	public static String OpenLCALog;
	public static String OpenLogFile;
	public static String OpenMiniatureView;
	public static String OpenPluginManager;
	public static String OpenProvider;
	public static String OpenUpdateManager;
	public static String Other;
	public static String OutOfMemory;
	public static String Output;
	public static String Outputs;
	public static String OverwriteRemoteChanges;
	public static String OverwriteFile;
	public static String OverwriteFileQuestion;

	// P
	public static String Parameter;
	public static String ParameterAggregationFunction;
	public static String ParameterAlreadyAdded;
	public static String ParameterDescriptionTable;
	public static String ParameterScope;
	public static String ParameterValueTable;
	public static String ParameterWithSameNameExists;
	public static String ParameterWithSameNameExistsInMethod;
	public static String Parameters;
	public static String Password;
	public static String Paste;
	public static String PedigreeMatrix;
	public static String PedigreeMatrixMessage;
	public static String Physical;
	public static String PhysicalAndEconomicAllocation;
	public static String PleaseEnterAName;
	public static String PleaseEnterANewName;
	public static String PleaseEnterTheNameOfTheNewCategory;
	public static String PleaseEnterYourAuthenticatorTokenToProceed;
	public static String PleaseSelectElements;
	public static String PleaseSelectProperties;
	public static String PleaseSpecifyHost;
	public static String PleaseSpecifyPortNumber;
	public static String PleaseSpecifyCompleteUrl;
	public static String PleaseSpecifyUser;
	public static String Point;
	public static String Polygon;
	public static String Port;
	public static String Position;
	public static String Prefer;
	public static String PreferDefaultProviders;
	public static String PreferredProcessType;
	public static String Preparing;
	public static String PreviousCommit;
	public static String Price;
	public static String Process;
	public static String ProcessContributionChart;
	public static String ProcessContributions;
	public static String ProcessDataQualitySchema;
	public static String ProcessDataQualityStatistics;
	public static String ProcessDocumentation;
	public static String ProcessEvaluationAndValidation;
	public static String ProcessExcelImportDescription;
	public static String ProcessLinks;
	public static String ProcessResults;
	public static String ProcessSchema;
	public static String ProcessType;
	public static String Processes;
	public static String ProcessesWithoutProviders;
	public static String ProducedBy;
	public static String Product;
	public static String ProductSystem;
	public static String ProductSystemExcelExport;
	public static String ProductSystemExcelExportMessage;
	public static String ProductSystemStatistics;
	public static String ProductSystems;
	public static String Progress;
	public static String Project;
	public static String ProjectSetup;
	public static String Projects;
	public static String Properties;
	public static String ProviderLinking;
	public static String Provider;
	public static String Providers;
	public static String Publication;
	public static String QuantitativeReference;
	public static String Quantity;
	public static String QuickResults;
	public static String RawValue;
	public static String ReallyDeleteShapeFile;
	public static String RebuildIndex;
	public static String RebuildingIndex;
	public static String RecalculateQuestion;
	public static String RecognizedLibraryDatasetsDescription;
	public static String ReconnectProcesslink;
	public static String Reference;
	public static String ReferenceCurrency;
	public static String ReferenceFlowProperty;
	public static String ReferenceFlowPropertyCannotBeDeleted;
	public static String ReferenceProcess;
	public static String ReferenceUnit;
	public static String ReferenceUnitCannotBeDeleted;
	public static String ReferenceUnitIsEmptyOrInvalid;
	public static String RegionalizedLCIA;
	public static String RejectMessage;
	public static String RelativeLciaResultsBarChart;
	public static String RelativeLciaResultsRadarChart;
	public static String Reload;
	public static String Remote;
	public static String RemoteDatabase;
	public static String RemoteModel;
	public static String Remove;
	public static String RemoveConnections;
	public static String RemoveIndicator;
	public static String RemoveObject;
	public static String RemoveScore;
	public static String RemoveSelected;
	public static String RemoveSupplyChain;
	public static String Rename;
	public static String ReplaceFlow;
	public static String ReplaceIn;
	public static String ReplaceProvider;
	public static String Report;
	public static String ReportName;
	public static String ReportSections;
	public static String ReportView;
	public static String Repository;
	public static String RepositoryImport;
	public static String RepositoryPath;
	public static String Reset;
	public static String ResetAll;
	public static String ResetSelection;
	public static String Resize;
	public static String RestoreDatabase;
	public static String Result;
	public static String Results;
	public static String ResultsOf;
	public static String ResultsOfProject;
	public static String Reviewer;
	public static String RiskLevel;
	public static String RoundingMode;
	public static String Route;
	public static String RoutingEnabled;
	public static String RunCalculation;

	// S
	public static String SamplingProcedure;
	public static String SankeyDiagram;
	public static String Sankey_ScaleDescription;
	public static String Save;
	public static String SaveAll;
	public static String SaveAs;
	public static String SaveAsImage;
	public static String SaveAsLCIResult;
	public static String SaveChanges;
	public static String SaveChangesQuestion;
	public static String SavingDiagramAsImageIn;
	public static String ScanningRepository;
	public static String Scores;
	public static String Search;
	public static String SearchAllTypes;
	public static String SearchInActors;
	public static String SearchInCurrencies;
	public static String SearchInDataQualitySystems;
	public static String SearchInFlowProperties;
	public static String SearchInFlows;
	public static String SearchInLCIAMethods;
	public static String SearchInLocations;
	public static String SearchInParameters;
	public static String SearchInProcesses;
	public static String SearchInProductSystems;
	public static String SearchInProjects;
	public static String SearchInSocialIndicators;
	public static String SearchInSources;
	public static String SearchInUnitGroups;
	public static String SearchParameters;
	public static String SearchProvidersFor;
	public static String SearchRecipientsFor;
	public static String SearchResults;
	public static String Searching;
	public static String SearchingForReferencedChanges;
	public static String SearchingForUnits;
	public static String Section;
	public static String Select;
	public static String SelectADirectory;
	public static String SelectAll;
	public static String SelectDataSets;
	public static String SelectImportFiles;
	public static String SelectLanguageNoteMessage;
	public static String SelectNext;
	public static String SelectObjectPage_Description;
	public static String SelectPrevious;
	public static String SelectProviders;
	public static String SelectRecipients;
	public static String SelectRepository;
	public static String SelectTheExportFile;
	public static String SelectTheParameterYouWantToReferTo;
	public static String SelectedCommit;
	public static String SelectedParameterWasAlreadyAdded;
	public static String Semicolon;
	public static String ServerConfigurations;
	public static String ServerUrl;
	public static String SetAsQuantitativeReference;
	public static String SetAsReferenceCurrency;
	public static String SetReferenceCurrencyQuestion;
	public static String SetSankeyDiagramOptions;
	public static String Settings;
	public static String SettingsForTheSankeyDiagram;
	public static String Show;
	public static String ShowComments;
	public static String ShowExecutedUpdates;
	public static String ShowFormulas;
	public static String ShowInHistory;
	public static String ShowInMap;
	public static String ShowOutline;
	public static String ShowValues;
	public static String Showviews;
	public static String SimaProCSVImport;
	public static String SingleScore;
	public static String SingleScoreBarChart;
	public static String SingleScoreTable;
	public static String SizeAfterCompression;
	public static String SizeBeforeCompression;
	public static String SocialAspect;
	public static String SocialAspects;
	public static String SocialAssessment;
	public static String SocialDataQualitySchema;
	public static String SocialIndicator;
	public static String SocialIndicators;
	public static String SocialSchema;
	public static String SolvingProblems;
	public static String SomeElementsAreNotSaved;
	public static String SomeParametersWereNotAdded;
	public static String Source;
	public static String SourceFileDeleteQuestion;
	public static String SourceFileOverwriteFileQuestion;
	public static String Sources;
	public static String StandardDeviation;
	public static String StandardDeviationFormula;
	public static String Start;
	public static String StartDate;
	public static String StartIPCServer;
	public static String Statistics;
	public static String StoreInventoryResult;
	public static String SubCategory;
	public static String SubgroupByProcesses;
	public static String Synonyms;
	public static String SystemDefinesUncertainties;
	public static String SystemProcess;
	public static String SystemSaveProceedQuestion;
	public static String Tab;
	public static String Tags;
	public static String TargetAmount;
	public static String Technology;
	public static String TechnologyDescription;
	public static String Telefax;
	public static String Telephone;
	public static String Test;
	public static String TestDistribution;
	public static String TexchnologyMatrix;
	public static String Text;
	public static String TextDropComponent_ToolTipText;
	public static String TextReference;
	public static String ThisWillCompressTheDatabase;
	public static String Time;
	public static String TimeAndAuthor;
	public static String TimeDescription;
	public static String Title;
	public static String ToDirectory;
	public static String ToFile;
	public static String TotalAddedValue;
	public static String TotalNetcosts;
	public static String TotalRequirements;
	public static String Tree;
	public static String TriangleDistribution;
	public static String Type;
	public static String TypeOfRestriction;
	public static String URL;
	public static String Uncertainties;
	public static String Uncertainty;
	public static String UncertaintyDistribution;
	public static String UniformDistribution;
	public static String Unit;
	public static String UnitAlreadyExistsInUnitGroup;
	public static String UnitGroup;
	public static String UnitGroups;
	public static String UnitIsUsed;
	public static String UnitMappingPage_Description;
	public static String UnitOfMeasurement;
	public static String UnitProcess;
	public static String Units;
	public static String UnitsAndFlowProperties;
	public static String Unknown;
	public static String Unmark;
	public static String UnsavedChanges;
	public static String Up;
	public static String UpToDate;
	public static String Update;
	public static String UpdateDatabase;
	public static String UpdateDatabaseQuestion;
	public static String UpdateMajorVersion;
	public static String UpdateMinorVersion;
	public static String UpdateReferenceCurrency;
	public static String UpdateWasAlreadyAddedOrExecuted;
	public static String UpdatingProductSystem;
	public static String UpgradingRepositoryIndex;
	public static String UpstreamInclDirect;
	public static String UpstreamTotal;
	public static String Usage;
	public static String UsageOf;
	public static String UsageType;
	public static String UseBrowserFeatures;
	public static String UseMaximumScoreForZeroValues;
	public static String UsedInProcesses;
	public static String User;

	public static String Validate;
	public static String ValidatingDatabase;
	public static String Value;
	public static String Variant;
	public static String VariantDescriptionTable;
	public static String Variants;
	public static String Version;
	public static String VersionNewer;
	public static String VeryHighRisk;
	public static String VeryLowRisk;
	public static String WaitingForServerToIndexDatasets;
	public static String Warning;
	public static String Warnings;
	public static String Waste;
	public static String Website;
	public static String WeightedArithmeticMean;
	public static String WeightedAverage;
	public static String WeightedSquaredAverage;
	public static String Weighting;
	public static String WeightingFactor;
	public static String Welcome;
	public static String Window;
	public static String With;
	public static String WithPassword;
	public static String Year;
	public static String Yes;
	public static String ZipCode;

	private static Map<String, String> map;

	static {
		NLS.initializeMessages("org.openlca.app.messages", M.class);
	}

	private M() {
	}

	private static Map<String, String> getMap() {
		if (map == null)
			map = new HashMap<>();
		try {
			for (Field field : M.class.getDeclaredFields()) {
				if (!Objects.equals(field.getType(), String.class))
					continue;
				if (!Modifier.isStatic(field.getModifiers()))
					continue;
				if (!Modifier.isPublic(field.getModifiers()))
					continue;
				String val = (String) field.get(null);
				map.put(field.getName(), val);
			}
		} catch (Exception e) {
			Logger log = LoggerFactory.getLogger(M.class);
			log.error("failed to get messages as map", e);
		}
		return map;
	}

	public static String asJson() {
		try {
			Gson gson = new Gson();
			return gson.toJson(getMap());
		} catch (Exception e) {
			Logger log = LoggerFactory.getLogger(M.class);
			log.error("failed to get messages as JSON string", e);
			return "{}";
		}
	}

}
