# auto-generated bindings; do not edit them
import org.openlca.proto.io.server.AboutService as AboutService
import org.openlca.core.model.AbstractEntity as AbstractEntity
import org.openlca.core.model.AbstractExchange as AbstractExchange
import org.openlca.core.model.Actor as Actor
import org.openlca.core.database.ActorDao as ActorDao
import org.openlca.core.model.descriptors.ActorDescriptor as ActorDescriptor
import org.openlca.core.database.descriptors.ActorDescriptors as ActorDescriptors
import org.openlca.io.ilcd.output.ActorExport as ActorExport
import org.openlca.jsonld.input.ActorReader as ActorReader
import org.openlca.core.database.usage.ActorUseSearch as ActorUseSearch
import org.openlca.jsonld.output.ActorWriter as ActorWriter
import org.openlca.core.math.data_quality.AggregationType as AggregationType
import org.openlca.core.model.AllocationFactor as AllocationFactor
import org.openlca.core.matrix.AllocationIndex as AllocationIndex
import org.openlca.core.model.AllocationMethod as AllocationMethod
import org.openlca.util.AllocationRef as AllocationRef
import org.openlca.util.AllocationUtils as AllocationUtils
import org.openlca.io.openepd.Api as Api
import org.openlca.util.AutoTagger as AutoTagger
import org.openlca.core.database.BaseDao as BaseDao
import org.openlca.util.BinUtils as BinUtils
import org.openlca.core.database.BlockFetch as BlockFetch
import org.openlca.core.results.providers.libblocks.BlockTechIndex as BlockTechIndex
import org.openlca.geo.calc.Bounds as Bounds
import org.openlca.core.matrix.format.ByteMatrixBuffer as ByteMatrixBuffer
import org.openlca.core.matrix.format.CSCByteMatrix as CSCByteMatrix
import org.openlca.core.matrix.format.CSCMatrix as CSCMatrix
import org.openlca.ipc.Cache as Cache
import org.openlca.core.library.reader.CachingLibReader as CachingLibReader
import org.openlca.core.matrix.CalcAllocationFactor as CalcAllocationFactor
import org.openlca.core.matrix.CalcExchange as CalcExchange
import org.openlca.core.matrix.CalcImpactFactor as CalcImpactFactor
import org.openlca.core.services.CalculationQueue as CalculationQueue
import org.openlca.core.model.CalculationSetup as CalculationSetup
import org.openlca.proto.io.input.CalculationSetupReader as CalculationSetupReader
import org.openlca.util.Categories as Categories
import org.openlca.core.model.Category as Category
import org.openlca.util.CategoryContentTest as CategoryContentTest
import org.openlca.core.database.CategoryDao as CategoryDao
import org.openlca.core.model.descriptors.CategoryDescriptor as CategoryDescriptor
import org.openlca.io.CategoryPair as CategoryPair
import org.openlca.io.CategoryPath as CategoryPath
import org.openlca.core.io.CategorySync as CategorySync
import org.openlca.core.database.usage.CategoryUseSearch as CategoryUseSearch
import org.openlca.io.xls.results.CellWriter as CellWriter
import org.openlca.io.simapro.csv.Compartment as Compartment
import org.openlca.text.CompartmentStemmer as CompartmentStemmer
import org.openlca.core.matrix.format.CompressedRowMatrix as CompressedRowMatrix
import org.openlca.io.ilcd.input.ContactImport as ContactImport
import org.openlca.core.results.Contribution as Contribution
import org.openlca.core.results.Contributions as Contributions
import org.openlca.core.matrix.cache.ConversionTable as ConversionTable
import org.openlca.util.Copy as Copy
import org.openlca.core.matrix.io.Csv as Csv
import org.openlca.core.matrix.io.CsvExport as CsvExport
import org.openlca.core.model.Currency as Currency
import org.openlca.core.database.CurrencyDao as CurrencyDao
import org.openlca.core.model.descriptors.CurrencyDescriptor as CurrencyDescriptor
import org.openlca.core.database.descriptors.CurrencyDescriptors as CurrencyDescriptors
import org.openlca.jsonld.input.CurrencyReader as CurrencyReader
import org.openlca.core.database.usage.CurrencyUseSearch as CurrencyUseSearch
import org.openlca.jsonld.output.CurrencyWriter as CurrencyWriter
import org.openlca.core.math.data_quality.DQData as DQData
import org.openlca.core.model.DQIndicator as DQIndicator
import org.openlca.core.math.data_quality.DQResult as DQResult
import org.openlca.core.model.DQScore as DQScore
import org.openlca.core.math.data_quality.DQSetup as DQSetup
import org.openlca.core.model.DQSystem as DQSystem
import org.openlca.core.database.DQSystemDao as DQSystemDao
import org.openlca.core.model.descriptors.DQSystemDescriptor as DQSystemDescriptor
import org.openlca.core.database.descriptors.DQSystemDescriptors as DQSystemDescriptors
import org.openlca.jsonld.input.DQSystemReader as DQSystemReader
import org.openlca.core.database.usage.DQSystemUseSearch as DQSystemUseSearch
import org.openlca.jsonld.output.DQSystemWriter as DQSystemWriter
import org.openlca.util.DQSystems as DQSystems
import org.openlca.core.database.Daos as Daos
import org.openlca.core.DataDir as DataDir
import org.openlca.ipc.handlers.DataHandler as DataHandler
import org.openlca.proto.io.server.DataUpdateService as DataUpdateService
import org.openlca.core.database.config.DatabaseConfigList as DatabaseConfigList
import org.openlca.core.database.DatabaseException as DatabaseException
import org.openlca.io.olca.DatabaseImport as DatabaseImport
import org.openlca.util.Databases as Databases
import org.openlca.core.io.DbEntityResolver as DbEntityResolver
import org.openlca.core.library.DbLibrarySwap as DbLibrarySwap
import org.openlca.core.database.DbUtils as DbUtils
import org.openlca.core.library.reader.DecryptingLibReader as DecryptingLibReader
import org.openlca.core.matrix.linking.DefaultProcessLinker as DefaultProcessLinker
import org.openlca.core.matrix.Demand as Demand
import org.openlca.core.matrix.format.DenseByteMatrix as DenseByteMatrix
import org.openlca.core.matrix.solvers.DenseFactorization as DenseFactorization
import org.openlca.core.matrix.format.DenseMatrix as DenseMatrix
import org.openlca.core.database.Derby as Derby
import org.openlca.core.database.config.DerbyConfig as DerbyConfig
import org.openlca.core.model.descriptors.Descriptor as Descriptor
import org.openlca.core.model.descriptors.DescriptorBuilder as DescriptorBuilder
import org.openlca.core.library.reader.DirectLibReader as DirectLibReader
import org.openlca.core.model.Direction as Direction
import org.openlca.util.Dirs as Dirs
import org.openlca.io.DisplayValues as DisplayValues
import org.openlca.util.Doubles as Doubles
import org.openlca.io.ecospold1.input.ES1KeyGen as ES1KeyGen
import org.openlca.io.ecospold1.input.ES1UnitFetch as ES1UnitFetch
import org.openlca.core.results.EachOneResult as EachOneResult
import org.openlca.io.openepd.Ec3Category as Ec3Category
import org.openlca.io.openepd.Ec3CategoryTree as Ec3CategoryTree
import org.openlca.io.openepd.Ec3Certifier as Ec3Certifier
import org.openlca.io.openepd.Ec3Client as Ec3Client
import org.openlca.io.openepd.Ec3Credentials as Ec3Credentials
import org.openlca.io.openepd.Ec3Epd as Ec3Epd
import org.openlca.io.openepd.Ec3EpdInfo as Ec3EpdInfo
import org.openlca.io.openepd.Ec3OrgInfo as Ec3OrgInfo
import org.openlca.io.openepd.Ec3Response as Ec3Response
import org.openlca.io.ecospold1.input.EcoSpold01Import as EcoSpold01Import
import org.openlca.io.ecospold1.output.EcoSpold1Export as EcoSpold1Export
import org.openlca.io.ecospold2.output.EcoSpold2Export as EcoSpold2Export
import org.openlca.io.ecospold2.output.EcoSpold2ExportConfig as EcoSpold2ExportConfig
import org.openlca.io.ecospold2.input.EcoSpold2Import as EcoSpold2Import
import org.openlca.core.database.EntityCache as EntityCache
import org.openlca.jsonld.Enums as Enums
import org.openlca.core.matrix.index.EnviFlow as EnviFlow
import org.openlca.core.services.EnviFlowId as EnviFlowId
import org.openlca.core.results.EnviFlowValue as EnviFlowValue
import org.openlca.core.matrix.index.EnviIndex as EnviIndex
import org.openlca.core.model.Epd as Epd
import org.openlca.io.openepd.EpdConverter as EpdConverter
import org.openlca.core.database.EpdDao as EpdDao
import org.openlca.core.model.descriptors.EpdDescriptor as EpdDescriptor
import org.openlca.core.database.descriptors.EpdDescriptors as EpdDescriptors
import org.openlca.io.openepd.EpdDoc as EpdDoc
import org.openlca.io.openepd.EpdImpactResult as EpdImpactResult
import org.openlca.io.ilcd.input.EpdImport as EpdImport
import org.openlca.io.openepd.EpdIndicatorResult as EpdIndicatorResult
import org.openlca.io.openepd.EpdMeasurement as EpdMeasurement
import org.openlca.core.model.EpdModule as EpdModule
import org.openlca.io.openepd.EpdOrg as EpdOrg
import org.openlca.io.openepd.EpdPcr as EpdPcr
import org.openlca.core.model.EpdProduct as EpdProduct
import org.openlca.io.openepd.EpdQuantity as EpdQuantity
import org.openlca.jsonld.input.EpdReader as EpdReader
import org.openlca.io.openepd.EpdScopeValue as EpdScopeValue
import org.openlca.jsonld.output.EpdWriter as EpdWriter
import org.openlca.io.xls.Excel as Excel
import org.openlca.util.Exceptions as Exceptions
import org.openlca.core.model.Exchange as Exchange
import org.openlca.core.database.ExchangeDao as ExchangeDao
import org.openlca.core.io.ExchangeProviderQueue as ExchangeProviderQueue
import org.openlca.core.matrix.cache.ExchangeTable as ExchangeTable
import org.openlca.core.database.usage.ExchangeUseSearch as ExchangeUseSearch
import org.openlca.util.Exchanges as Exchanges
import org.openlca.io.ecospold1.output.ExportConfig as ExportConfig
import org.openlca.ipc.handlers.ExportHandler as ExportHandler
import org.openlca.core.results.providers.FactorizationSolver as FactorizationSolver
import org.openlca.geo.geojson.Feature as Feature
import org.openlca.geo.geojson.FeatureCollection as FeatureCollection
import org.openlca.core.database.FileStore as FileStore
import org.openlca.jsonld.FileStoreReader as FileStoreReader
import org.openlca.jsonld.FileStoreWriter as FileStoreWriter
import org.openlca.core.model.Flow as Flow
import org.openlca.core.database.FlowDao as FlowDao
import org.openlca.core.model.descriptors.FlowDescriptor as FlowDescriptor
import org.openlca.core.database.descriptors.FlowDescriptors as FlowDescriptors
import org.openlca.io.ilcd.output.FlowExport as FlowExport
import org.openlca.io.ilcd.input.FlowImport as FlowImport
import org.openlca.core.io.maps.FlowMap as FlowMap
import org.openlca.core.io.maps.FlowMapEntry as FlowMapEntry
import org.openlca.core.model.FlowProperty as FlowProperty
import org.openlca.core.database.FlowPropertyDao as FlowPropertyDao
import org.openlca.core.model.descriptors.FlowPropertyDescriptor as FlowPropertyDescriptor
import org.openlca.core.database.descriptors.FlowPropertyDescriptors as FlowPropertyDescriptors
import org.openlca.io.ilcd.output.FlowPropertyExport as FlowPropertyExport
import org.openlca.core.model.FlowPropertyFactor as FlowPropertyFactor
import org.openlca.core.database.usage.FlowPropertyFactorUseSearch as FlowPropertyFactorUseSearch
import org.openlca.io.ilcd.input.FlowPropertyImport as FlowPropertyImport
import org.openlca.jsonld.input.FlowPropertyReader as FlowPropertyReader
import org.openlca.core.model.FlowPropertyType as FlowPropertyType
import org.openlca.core.database.usage.FlowPropertyUseSearch as FlowPropertyUseSearch
import org.openlca.jsonld.output.FlowPropertyWriter as FlowPropertyWriter
import org.openlca.jsonld.input.FlowReader as FlowReader
import org.openlca.core.io.maps.FlowRef as FlowRef
import org.openlca.core.model.FlowResult as FlowResult
import org.openlca.io.maps.FlowSync as FlowSync
import org.openlca.core.matrix.cache.FlowTable as FlowTable
import org.openlca.core.model.FlowType as FlowType
import org.openlca.core.database.usage.FlowUseSearch as FlowUseSearch
import org.openlca.jsonld.output.FlowWriter as FlowWriter
import org.openlca.util.ForegroundSystemGenerator as ForegroundSystemGenerator
import org.openlca.io.Format as Format
import org.openlca.util.Formula as Formula
import org.openlca.geo.geojson.GeoJSON as GeoJSON
import org.openlca.geo.GeoJson2Kml as GeoJson2Kml
import org.openlca.geo.GeoJsonImport as GeoJsonImport
import org.openlca.util.Geometries as Geometries
import org.openlca.geo.geojson.Geometry as Geometry
import org.openlca.geo.geojson.GeometryCollection as GeometryCollection
import org.openlca.core.results.GroupingContribution as GroupingContribution
import org.openlca.io.HSCSim as HSCSim
import org.openlca.ipc.handlers.HandlerContext as HandlerContext
import org.openlca.core.matrix.format.HashPointByteMatrix as HashPointByteMatrix
import org.openlca.core.matrix.format.HashPointMatrix as HashPointMatrix
import org.openlca.io.ilcd.ILCDExport as ILCDExport
import org.openlca.io.ilcd.ILCDImport as ILCDImport
import org.openlca.core.matrix.ImpactBuilder as ImpactBuilder
import org.openlca.core.model.ImpactCategory as ImpactCategory
import org.openlca.core.database.ImpactCategoryDao as ImpactCategoryDao
import org.openlca.jsonld.input.ImpactCategoryReader as ImpactCategoryReader
import org.openlca.core.database.usage.ImpactCategoryUseSearch as ImpactCategoryUseSearch
import org.openlca.jsonld.output.ImpactCategoryWriter as ImpactCategoryWriter
import org.openlca.core.model.descriptors.ImpactDescriptor as ImpactDescriptor
import org.openlca.core.database.descriptors.ImpactDescriptors as ImpactDescriptors
import org.openlca.util.ImpactDirections as ImpactDirections
import org.openlca.core.model.ImpactFactor as ImpactFactor
import org.openlca.io.ilcd.input.ImpactImport as ImpactImport
import org.openlca.core.matrix.index.ImpactIndex as ImpactIndex
import org.openlca.core.model.ImpactMethod as ImpactMethod
import org.openlca.core.database.ImpactMethodDao as ImpactMethodDao
import org.openlca.core.model.descriptors.ImpactMethodDescriptor as ImpactMethodDescriptor
import org.openlca.core.database.descriptors.ImpactMethodDescriptors as ImpactMethodDescriptors
import org.openlca.io.ilcd.output.ImpactMethodExport as ImpactMethodExport
import org.openlca.jsonld.input.ImpactMethodReader as ImpactMethodReader
import org.openlca.core.database.usage.ImpactMethodUseSearch as ImpactMethodUseSearch
import org.openlca.jsonld.output.ImpactMethodWriter as ImpactMethodWriter
import org.openlca.core.model.ImpactResult as ImpactResult
import org.openlca.core.results.ImpactValue as ImpactValue
import org.openlca.io.ecospold1.input.ImportConfig as ImportConfig
import org.openlca.core.io.ImportLog as ImportLog
import org.openlca.proto.io.input.ImportStatus as ImportStatus
import org.openlca.proto.io.input.In as In
import org.openlca.proto.io.InMemoryProtoStore as InMemoryProtoStore
import org.openlca.core.model.store.InMemoryStore as InMemoryStore
import org.openlca.core.matrix.IndexedMatrix as IndexedMatrix
import org.openlca.io.openepd.io.IndicatorMapping as IndicatorMapping
import org.openlca.io.xls.results.InfoSheet as InfoSheet
import org.openlca.geo.calc.IntersectionCalculator as IntersectionCalculator
import org.openlca.core.matrix.InventoryBuilder as InventoryBuilder
import org.openlca.core.results.providers.InversionResult as InversionResult
import org.openlca.core.results.providers.InversionResultProvider as InversionResultProvider
import org.openlca.io.ecospold2.input.IsicCategoryTreeSync as IsicCategoryTreeSync
import org.openlca.validation.Item as Item
import org.openlca.core.matrix.io.index.IxContext as IxContext
import org.openlca.core.matrix.io.index.IxEnviIndex as IxEnviIndex
import org.openlca.core.matrix.io.index.IxEnviItem as IxEnviItem
import org.openlca.core.matrix.io.index.IxFlow as IxFlow
import org.openlca.core.matrix.io.index.IxFormat as IxFormat
import org.openlca.core.matrix.io.index.IxImpact as IxImpact
import org.openlca.core.matrix.io.index.IxImpactIndex as IxImpactIndex
import org.openlca.core.matrix.io.index.IxImpactItem as IxImpactItem
import org.openlca.core.matrix.io.index.IxLocation as IxLocation
import org.openlca.core.matrix.io.index.IxProto as IxProto
import org.openlca.core.matrix.io.index.IxProvider as IxProvider
import org.openlca.core.matrix.io.index.IxTechIndex as IxTechIndex
import org.openlca.core.matrix.io.index.IxTechItem as IxTechItem
import org.openlca.core.matrix.format.JavaMatrix as JavaMatrix
import org.openlca.core.matrix.solvers.JavaSolver as JavaSolver
import org.openlca.jsonld.Json as Json
import org.openlca.core.services.JsonCalculationSetup as JsonCalculationSetup
import org.openlca.core.services.JsonDataService as JsonDataService
import org.openlca.util.JsonDiffZip as JsonDiffZip
import org.openlca.jsonld.output.JsonExport as JsonExport
import org.openlca.jsonld.input.JsonImport as JsonImport
import org.openlca.core.services.JsonRef as JsonRef
import org.openlca.jsonld.output.JsonRefs as JsonRefs
import org.openlca.core.services.JsonResultService as JsonResultService
import org.openlca.util.KeyGen as KeyGen
import org.openlca.geo.Kml2GeoJson as Kml2GeoJson
import org.openlca.core.results.providers.LazyLibrarySolver as LazyLibrarySolver
import org.openlca.core.results.LcaResult as LcaResult
import org.openlca.core.results.providers.LibImpactMatrix as LibImpactMatrix
import org.openlca.core.library.LibMatrix as LibMatrix
import org.openlca.core.library.reader.LibReaderRegistry as LibReaderRegistry
import org.openlca.util.LibStrip as LibStrip
import org.openlca.core.library.Libraries as Libraries
import org.openlca.core.library.Library as Library
import org.openlca.core.library.LibraryDir as LibraryDir
import org.openlca.core.library.LibraryExport as LibraryExport
import org.openlca.core.library.LibraryInfo as LibraryInfo
import org.openlca.core.results.providers.libblocks.LibraryInversionSolver as LibraryInversionSolver
import org.openlca.core.library.LibraryPackage as LibraryPackage
import org.openlca.geo.geojson.LineString as LineString
import org.openlca.core.matrix.linking.LinkingConfig as LinkingConfig
import org.openlca.core.matrix.linking.LinkingInfo as LinkingInfo
import org.openlca.core.model.Location as Location
import org.openlca.core.database.LocationDao as LocationDao
import org.openlca.core.model.descriptors.LocationDescriptor as LocationDescriptor
import org.openlca.core.database.descriptors.LocationDescriptors as LocationDescriptors
import org.openlca.jsonld.input.LocationReader as LocationReader
import org.openlca.core.results.LocationResult as LocationResult
import org.openlca.core.database.usage.LocationUseSearch as LocationUseSearch
import org.openlca.jsonld.output.LocationWriter as LocationWriter
import org.openlca.core.matrix.index.LongPair as LongPair
import org.openlca.io.maps.MapFactor as MapFactor
import org.openlca.io.openepd.io.MappedExportResult as MappedExportResult
import org.openlca.core.model.MappingFile as MappingFile
import org.openlca.core.database.MappingFileDao as MappingFileDao
import org.openlca.io.openepd.io.MappingModel as MappingModel
import org.openlca.core.io.maps.MappingStatus as MappingStatus
import org.openlca.core.matrix.io.MarketFormatWriter as MarketFormatWriter
import org.openlca.io.ecospold2.input.MarketProcessCleanUp as MarketProcessCleanUp
import org.openlca.core.matrix.io.MatBinMatrixReader as MatBinMatrixReader
import org.openlca.core.matrix.format.MatrixBuilder as MatrixBuilder
import org.openlca.core.matrix.cache.MatrixCache as MatrixCache
import org.openlca.core.matrix.MatrixConfig as MatrixConfig
import org.openlca.core.matrix.format.MatrixConverter as MatrixConverter
import org.openlca.core.matrix.MatrixData as MatrixData
import org.openlca.io.xls.MatrixExcelExport as MatrixExcelExport
import org.openlca.core.matrix.io.MatrixExport as MatrixExport
import org.openlca.io.MatrixImageExport as MatrixImageExport
import org.openlca.core.math.MatrixRowSorter as MatrixRowSorter
import org.openlca.jsonld.MemStore as MemStore
import org.openlca.proto.io.Messages as Messages
import org.openlca.io.ecospold2.input.MethodImport as MethodImport
import org.openlca.io.openepd.io.MethodMapping as MethodMapping
import org.openlca.io.simapro.csv.output.MethodWriter as MethodWriter
import org.openlca.io.ilcd.input.models.ModelImport as ModelImport
import org.openlca.jsonld.ModelPath as ModelPath
import org.openlca.core.model.ModelType as ModelType
import org.openlca.geo.calc.Mollweide as Mollweide
import org.openlca.core.library.MountAction as MountAction
import org.openlca.core.library.Mounter as Mounter
import org.openlca.geo.geojson.MultiLineString as MultiLineString
import org.openlca.geo.geojson.MultiPoint as MultiPoint
import org.openlca.geo.geojson.MultiPolygon as MultiPolygon
import org.openlca.core.database.MySQL as MySQL
import org.openlca.core.database.config.MySqlConfig as MySqlConfig
import org.openlca.core.math.data_quality.NAHandling as NAHandling
import org.openlca.core.matrix.solvers.NativeSolver as NativeSolver
import org.openlca.core.database.NativeSql as NativeSql
import org.openlca.core.matrix.io.NpyMatrix as NpyMatrix
import org.openlca.core.math.NumberGenerator as NumberGenerator
import org.openlca.core.model.NwFactor as NwFactor
import org.openlca.core.model.NwSet as NwSet
import org.openlca.core.database.NwSetDao as NwSetDao
import org.openlca.core.model.descriptors.NwSetDescriptor as NwSetDescriptor
import org.openlca.core.matrix.NwSetTable as NwSetTable
import org.openlca.util.OS as OS
import org.openlca.proto.io.output.Out as Out
import org.openlca.jsonld.PackageInfo as PackageInfo
import org.openlca.util.Pair as Pair
import org.openlca.core.model.Parameter as Parameter
import org.openlca.core.database.ParameterDao as ParameterDao
import org.openlca.core.model.descriptors.ParameterDescriptor as ParameterDescriptor
import org.openlca.core.database.descriptors.ParameterDescriptors as ParameterDescriptors
import org.openlca.jsonld.input.ParameterReader as ParameterReader
import org.openlca.core.model.ParameterRedef as ParameterRedef
import org.openlca.proto.io.input.ParameterRedefReader as ParameterRedefReader
import org.openlca.core.model.ParameterRedefSet as ParameterRedefSet
import org.openlca.util.ParameterRedefSets as ParameterRedefSets
import org.openlca.core.model.ParameterScope as ParameterScope
import org.openlca.core.matrix.ParameterTable as ParameterTable
import org.openlca.core.database.usage.ParameterUsageTree as ParameterUsageTree
import org.openlca.core.database.usage.ParameterUseSearch as ParameterUseSearch
import org.openlca.jsonld.output.ParameterWriter as ParameterWriter
import org.openlca.core.model.ParameterizedEntity as ParameterizedEntity
import org.openlca.util.Parameters as Parameters
import org.openlca.io.ecospold2.input.PersonUpdate as PersonUpdate
import org.openlca.text.PhraseParser as PhraseParser
import org.openlca.text.PhraseSimilarity as PhraseSimilarity
import org.openlca.geo.geojson.Point as Point
import org.openlca.geo.geojson.Polygon as Polygon
import org.openlca.core.library.PreMountCheck as PreMountCheck
import org.openlca.core.library.PreMountState as PreMountState
import org.openlca.geo.calc.PrecisionReduction as PrecisionReduction
import org.openlca.core.model.Process as Process
import org.openlca.core.database.ProcessDao as ProcessDao
import org.openlca.core.model.descriptors.ProcessDescriptor as ProcessDescriptor
import org.openlca.core.database.descriptors.ProcessDescriptors as ProcessDescriptors
import org.openlca.core.model.ProcessDocumentation as ProcessDocumentation
import org.openlca.io.ilcd.output.ProcessExport as ProcessExport
import org.openlca.core.model.ProcessGroup as ProcessGroup
import org.openlca.core.model.ProcessGroupSet as ProcessGroupSet
import org.openlca.core.database.ProcessGroupSetDao as ProcessGroupSetDao
import org.openlca.core.results.ProcessGrouping as ProcessGrouping
import org.openlca.io.ilcd.input.ProcessImport as ProcessImport
import org.openlca.core.model.ProcessLink as ProcessLink
import org.openlca.core.matrix.ProcessLinkSearchMap as ProcessLinkSearchMap
import org.openlca.jsonld.input.ProcessReader as ProcessReader
import org.openlca.core.matrix.cache.ProcessTable as ProcessTable
import org.openlca.core.model.ProcessType as ProcessType
import org.openlca.core.database.usage.ProcessUseSearch as ProcessUseSearch
import org.openlca.jsonld.output.ProcessWriter as ProcessWriter
import org.openlca.util.Processes as Processes
import org.openlca.core.model.ProductSystem as ProductSystem
import org.openlca.core.matrix.ProductSystemBuilder as ProductSystemBuilder
import org.openlca.core.database.ProductSystemDao as ProductSystemDao
import org.openlca.core.model.descriptors.ProductSystemDescriptor as ProductSystemDescriptor
import org.openlca.jsonld.input.ProductSystemReader as ProductSystemReader
import org.openlca.core.database.usage.ProductSystemUseSearch as ProductSystemUseSearch
import org.openlca.jsonld.output.ProductSystemWriter as ProductSystemWriter
import org.openlca.util.ProductSystems as ProductSystems
import org.openlca.core.model.Project as Project
import org.openlca.core.database.ProjectDao as ProjectDao
import org.openlca.core.model.descriptors.ProjectDescriptor as ProjectDescriptor
import org.openlca.core.database.descriptors.ProjectDescriptors as ProjectDescriptors
import org.openlca.jsonld.input.ProjectReader as ProjectReader
import org.openlca.core.results.ProjectResult as ProjectResult
import org.openlca.io.xls.results.ProjectResultExport as ProjectResultExport
import org.openlca.core.model.ProjectVariant as ProjectVariant
import org.openlca.jsonld.output.ProjectWriter as ProjectWriter
import org.openlca.geo.calc.Projection as Projection
import org.openlca.geo.geojson.Proto as Proto
import org.openlca.proto.io.input.ProtoImport as ProtoImport
import org.openlca.core.matrix.linking.ProviderIndex as ProviderIndex
import org.openlca.core.matrix.linking.ProviderLinking as ProviderLinking
import org.openlca.core.matrix.linking.ProviderSearch as ProviderSearch
import org.openlca.jsonld.input.Quantity as Quantity
import org.openlca.core.database.Query as Query
import org.openlca.io.refdata.RefDataExport as RefDataExport
import org.openlca.io.refdata.RefDataImport as RefDataImport
import org.openlca.core.model.RefEntity as RefEntity
import org.openlca.core.database.RefEntityDao as RefEntityDao
import org.openlca.util.RefIdMap as RefIdMap
import org.openlca.core.math.ReferenceAmount as ReferenceAmount
import org.openlca.proto.io.output.Refs as Refs
import org.openlca.core.database.internal.Resource as Resource
import org.openlca.core.services.Response as Response
import org.openlca.ipc.Responses as Responses
import org.openlca.core.model.Result as Result
import org.openlca.core.database.ResultDao as ResultDao
import org.openlca.core.model.descriptors.ResultDescriptor as ResultDescriptor
import org.openlca.core.database.descriptors.ResultDescriptors as ResultDescriptors
import org.openlca.io.xls.results.system.ResultExport as ResultExport
import org.openlca.ipc.handlers.ResultHandler as ResultHandler
import org.openlca.core.results.ResultItemOrder as ResultItemOrder
import org.openlca.core.results.providers.ResultModelProvider as ResultModelProvider
import org.openlca.core.results.providers.ResultProviders as ResultProviders
import org.openlca.jsonld.input.ResultReader as ResultReader
import org.openlca.core.database.usage.ResultUsageSearch as ResultUsageSearch
import org.openlca.jsonld.output.ResultWriter as ResultWriter
import org.openlca.util.Results as Results
import org.openlca.core.model.RiskLevel as RiskLevel
import org.openlca.core.model.descriptors.RootDescriptor as RootDescriptor
import org.openlca.core.model.RootEntity as RootEntity
import org.openlca.core.database.RootEntityDao as RootEntityDao
import org.openlca.ipc.RpcError as RpcError
import org.openlca.ipc.RpcRequest as RpcRequest
import org.openlca.ipc.RpcResponse as RpcResponse
import org.openlca.ipc.handlers.RuntimeHandler as RuntimeHandler
import org.openlca.core.database.internal.SQLScriptWriter as SQLScriptWriter
import org.openlca.core.results.Sankey as Sankey
import org.openlca.jsonld.SchemaVersion as SchemaVersion
import org.openlca.core.database.internal.ScriptRunner as ScriptRunner
import org.openlca.core.matrix.solvers.SeqAgg as SeqAgg
import org.openlca.core.matrix.solvers.SequentialSolver as SequentialSolver
import org.openlca.proto.io.server.Server as Server
import org.openlca.core.services.ServerConfig as ServerConfig
import org.openlca.io.simapro.csv.input.SimaProCsvImport as SimaProCsvImport
import org.openlca.io.simapro.csv.output.SimaProExport as SimaProExport
import org.openlca.io.simapro.csv.SimaProUnit as SimaProUnit
import org.openlca.core.matrix.io.SimpleBin as SimpleBin
import org.openlca.core.results.providers.SimpleResultProvider as SimpleResultProvider
import org.openlca.core.results.SimulationResult as SimulationResult
import org.openlca.io.xls.results.SimulationResultExport as SimulationResultExport
import org.openlca.core.math.Simulator as Simulator
import org.openlca.core.model.SocialAspect as SocialAspect
import org.openlca.core.model.SocialIndicator as SocialIndicator
import org.openlca.core.database.SocialIndicatorDao as SocialIndicatorDao
import org.openlca.core.model.descriptors.SocialIndicatorDescriptor as SocialIndicatorDescriptor
import org.openlca.core.database.descriptors.SocialIndicatorDescriptors as SocialIndicatorDescriptors
import org.openlca.jsonld.input.SocialIndicatorReader as SocialIndicatorReader
import org.openlca.core.database.usage.SocialIndicatorUseSearch as SocialIndicatorUseSearch
import org.openlca.jsonld.output.SocialIndicatorWriter as SocialIndicatorWriter
import org.openlca.core.results.providers.SolverContext as SolverContext
import org.openlca.core.library.reader.SolvingLibReader as SolvingLibReader
import org.openlca.core.model.Source as Source
import org.openlca.core.database.SourceDao as SourceDao
import org.openlca.core.model.descriptors.SourceDescriptor as SourceDescriptor
import org.openlca.core.database.descriptors.SourceDescriptors as SourceDescriptors
import org.openlca.io.ilcd.output.SourceExport as SourceExport
import org.openlca.io.ilcd.input.SourceImport as SourceImport
import org.openlca.jsonld.input.SourceReader as SourceReader
import org.openlca.io.ecospold2.input.SourceUpdate as SourceUpdate
import org.openlca.core.database.usage.SourceUseSearch as SourceUseSearch
import org.openlca.jsonld.output.SourceWriter as SourceWriter
import org.openlca.core.matrix.solvers.SparseFactorization as SparseFactorization
import org.openlca.core.matrix.format.SparseMatrixData as SparseMatrixData
import org.openlca.io.ecospold2.input.Spold2Files as Spold2Files
import org.openlca.core.results.Statistics as Statistics
import org.openlca.util.Strings as Strings
import org.openlca.core.matrix.linking.SubSystemLinker as SubSystemLinker
import org.openlca.io.maps.SyncFlow as SyncFlow
import org.openlca.core.math.SystemCalculator as SystemCalculator
import org.openlca.io.ilcd.output.SystemExport as SystemExport
import org.openlca.core.results.SystemProcess as SystemProcess
import org.openlca.util.TLongSets as TLongSets
import org.openlca.core.results.TagResult as TagResult
import org.openlca.core.matrix.index.TechFlow as TechFlow
import org.openlca.core.services.TechFlowId as TechFlowId
import org.openlca.core.results.TechFlowValue as TechFlowValue
import org.openlca.core.matrix.index.TechIndex as TechIndex
import org.openlca.core.matrix.linking.TechIndexBuilder as TechIndexBuilder
import org.openlca.core.matrix.linking.TechIndexCutoffBuilder as TechIndexCutoffBuilder
import org.openlca.util.TopoSort as TopoSort
import org.openlca.util.Triple as Triple
import org.openlca.core.matrix.uncertainties.UMatrix as UMatrix
import org.openlca.core.matrix.solvers.UmfFactorizedMatrix as UmfFactorizedMatrix
import org.openlca.core.matrix.solvers.Umfpack as Umfpack
import org.openlca.jsonld.input.Uncertainties as Uncertainties
import org.openlca.core.model.Uncertainty as Uncertainty
import org.openlca.io.ecospold2.UncertaintyConverter as UncertaintyConverter
import org.openlca.core.model.UncertaintyType as UncertaintyType
import org.openlca.core.model.Unit as Unit
import org.openlca.core.database.UnitDao as UnitDao
import org.openlca.core.model.descriptors.UnitDescriptor as UnitDescriptor
import org.openlca.core.model.UnitGroup as UnitGroup
import org.openlca.core.database.UnitGroupDao as UnitGroupDao
import org.openlca.core.model.descriptors.UnitGroupDescriptor as UnitGroupDescriptor
import org.openlca.core.database.descriptors.UnitGroupDescriptors as UnitGroupDescriptors
import org.openlca.io.ilcd.output.UnitGroupExport as UnitGroupExport
import org.openlca.io.ilcd.input.UnitGroupImport as UnitGroupImport
import org.openlca.jsonld.input.UnitGroupReader as UnitGroupReader
import org.openlca.core.database.usage.UnitGroupUseSearch as UnitGroupUseSearch
import org.openlca.jsonld.output.UnitGroupWriter as UnitGroupWriter
import org.openlca.io.UnitMapping as UnitMapping
import org.openlca.io.UnitMappingEntry as UnitMappingEntry
import org.openlca.io.UnitMappingSync as UnitMappingSync
import org.openlca.core.database.usage.UnitUsageSearch as UnitUsageSearch
import org.openlca.jsonld.output.UnitWriter as UnitWriter
import org.openlca.jsonld.input.UpdateMode as UpdateMode
import org.openlca.core.database.upgrades.Upgrade11 as Upgrade11
import org.openlca.core.database.upgrades.Upgrades as Upgrades
import org.openlca.core.results.UpstreamNode as UpstreamNode
import org.openlca.core.results.UpstreamTree as UpstreamTree
import org.openlca.jsonld.output.Util as Util
import org.openlca.validation.Validation as Validation
import org.openlca.core.model.Version as Version
import org.openlca.core.database.upgrades.VersionState as VersionState
import org.openlca.io.openepd.io.Vocab as Vocab
import org.openlca.io.ecospold2.input.WasteFlows as WasteFlows
import org.openlca.geo.calc.WebMercator as WebMercator
import org.openlca.text.WordBuffer as WordBuffer
import org.openlca.proto.io.output.WriterConfig as WriterConfig
import org.openlca.io.Xml as Xml
import org.openlca.util.ZipFiles as ZipFiles
import org.openlca.jsonld.ZipStore as ZipStore
