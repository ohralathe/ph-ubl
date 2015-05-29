/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.ubl21.codelist;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.helger.commons.annotations.CodingStyleguideUnaware;
import com.helger.commons.annotations.Nonempty;
import com.helger.commons.id.IHasID;
import com.helger.commons.lang.EnumHelper;
import com.helger.commons.name.IHasDisplayName;


/**
 * This file was automatically generated from Genericode file PackagingTypeCode-2.1.gc. Do NOT edit!
 * It contains a total of 378 entries!
 * @author com.helger.ubl21.main.MainCreateEnumsGenericode21
 * 
 */
@CodingStyleguideUnaware
public enum EPackagingTypeCode21
    implements IHasID<String> , IHasDisplayName
{
    _1A("1A", "Drum, steel", null, null, "34"),
    _1B("1B", "Drum, aluminium", null, null, "34"),
    _1D("1D", "Drum, plywood", null, null, "34"),
    _1F("1F", "Container, flexible", null, "A packaging container of flexible construction.", "93"),
    _1G("1G", "Drum, fibre", null, null, "34"),
    _1W("1W", "Drum, wooden", null, null, "34 or 35"),
    _2C("2C", "Barrel, wooden", null, null, "44 or 45"),
    _3A("3A", "Jerrican, steel", null, null, "23 or 33"),
    _3H("3H", "Jerrican, plastic", null, null, "23 or 33"),
    _43("43", "Bag, super bulk", null, "A cloth plastic or paper based bag having the dimensions of the pallet on which it is constructed.", "64"),
    _44("44", "Bag, polybag", null, "A type of plastic bag, typically used to wrap promotional pieces, publications, product samples, and/or catalogues.", "62 or 63"),
    _4A("4A", "Box, steel", null, null, "21 to 25"),
    _4B("4B", "Box, aluminium", null, null, "21 to 25"),
    _4C("4C", "Box, natural wood", null, null, "21 to 25"),
    _4D("4D", "Box, plywood", null, null, "21 to 25"),
    _4F("4F", "Box, reconstituted wood", null, null, "21 to 25"),
    _4G("4G", "Box, fibreboard", null, null, "21 to 25"),
    _4H("4H", "Box, plastic", null, null, "21 to 25"),
    _5H("5H", "Bag, woven plastic", null, null, "62 to 64"),
    _5L("5L", "Bag, textile", null, null, "62 to 64"),
    _5M("5M", "Bag, paper", null, null, "62 to 64"),
    _6H("6H", "Composite packaging, plastic receptacle", null, null, "24 or 25 or 33 or 34"),
    _6P("6P", "Composite packaging, glass receptacle", null, null, "23 or 24 or 25 or 33 or 34 or 62 or 63"),
    _7A("7A", "Case, car", null, "A type of portable container designed to store equipment for carriage in an automobile.", "22 or 23"),
    _7B("7B", "Case, wooden", null, "A case made of wood for retaining substances or articles.", "24 or 25"),
    _8A("8A", "Pallet, wooden", null, "A platform or open-ended box, made of wood, on which goods are retained for ease of mechanical handling during transport and storage.", "24 or 25"),
    _8B("8B", "Crate, wooden", null, "A receptacle, made of wood, on which goods are retained for ease of mechanical handling during transport and storage.", "23 to 27"),
    _8C("8C", "Bundle, wooden", null, "Loose or unpacked pieces of wood tied or wrapped together.", "16"),
    AA("AA", "Intermediate bulk container, rigid plastic", null, null, "23 to 26"),
    AB("AB", "Receptacle, fibre", null, "Containment vessel made of fibre used for retaining substances or articles.", "21 to 23 or 31 to 33 or 41 to 43"),
    AC("AC", "Receptacle, paper", null, "Containment vessel made of paper for retaining substances or articles.", "21 to 23 or 31 to 33 or 41 to 43"),
    AD("AD", "Receptacle, wooden", null, "Containment vessel made of wood for retaining substances or articles.", "21 to 23 or 31 to 33 or 41 to 43"),
    AE("AE", "Aerosol", null, null, "42 or 43"),
    AF("AF", "Pallet, modular, collars 80cms * 60cms", null, "Standard sized pallet of dimensions 80 centimeters by 60 centimeters (cms).", "92"),
    AG("AG", "Pallet, shrinkwrapped", null, "Pallet load secured with transparent plastic film that has been wrapped around and then shrunk tightly.", "92"),
    AH("AH", "Pallet, 100cms * 110cms", null, "Standard sized pallet of dimensions 100centimeters by 110 centimeters (cms).", "92"),
    AI("AI", "Clamshell", null, null, "21 to 23"),
    AJ("AJ", "Cone", null, "Container used in the transport of linear material such as yarn.", "51"),
    AL("AL", "Ball", null, "A spherical containment vessel for retaining substances or articles.", "46"),
    AM("AM", "Ampoule, non-protected", null, null, "31"),
    AP("AP", "Ampoule, protected", null, null, "31"),
    AT("AT", "Atomizer", null, null, "42 or 43"),
    AV("AV", "Capsule", null, null, "92"),
    B4("B4", "Belt", null, "A band use to retain multiple articles together.", "93"),
    BA("BA", "Barrel", null, null, "44 or 45"),
    BB("BB", "Bobbin", null, null, "91"),
    BC("BC", "Bottlecrate / bottlerack", null, null, "29"),
    BD("BD", "Board", null, null, "16"),
    BE("BE", "Bundle", null, null, "61 to 65"),
    BF("BF", "Balloon, non-protected", null, null, "42 or 43"),
    BG("BG", "Bag", null, "A receptacle made of flexible material with an open or closed top.", "62 to 64"),
    BH("BH", "Bunch", null, null, "61 to 65"),
    BI("BI", "Bin", null, null, "21 or 25"),
    BJ("BJ", "Bucket", null, null, "51"),
    BK("BK", "Basket", null, null, "27"),
    BL("BL", "Bale, compressed", null, null, "65"),
    BM("BM", "Basin", null, null, "51"),
    BN("BN", "Bale, non-compressed", null, null, "65"),
    BO("BO", "Bottle, non-protected, cylindrical", null, "A narrow-necked cylindrical shaped vessel without external protective packing material.", "32 or 33"),
    BP("BP", "Balloon, protected", null, null, "42 or 43"),
    BQ("BQ", "Bottle, protected cylindrical", null, "A narrow-necked cylindrical shaped vessel with external protective packing material.", "32 or 33"),
    BR("BR", "Bar", null, null, "16"),
    BS("BS", "Bottle, non-protected, bulbous", null, "A narrow-necked bulb shaped vessel without external protective packing material.", "42 or 43"),
    BT("BT", "Bolt", null, null, "13"),
    BU("BU", "Butt", null, null, "44 or 45"),
    BV("BV", "Bottle, protected bulbous", null, "A narrow-necked bulb shaped vessel with external protective packing material.", "42 or 43"),
    BW("BW", "Box, for liquids", null, null, "21 to 25"),
    BX("BX", "Box", null, null, "21 to 25"),
    BY("BY", "Board, in bundle/bunch/truss", null, null, "16"),
    BZ("BZ", "Bars, in bundle/bunch/truss", null, null, "16"),
    CA("CA", "Can, rectangular", null, null, "22"),
    CB("CB", "Crate, beer", null, null, "23 to 27"),
    CC("CC", "Churn", null, null, "32 or 33"),
    CD("CD", "Can, with handle and spout", null, null, "22"),
    CE("CE", "Creel", null, null, "27"),
    CF("CF", "Coffer", null, null, "24"),
    CG("CG", "Cage", null, null, "26"),
    CH("CH", "Chest", null, null, "25"),
    CI("CI", "Canister", null, null, "21 or 22"),
    CJ("CJ", "Coffin", null, null, "54"),
    CK("CK", "Cask", null, null, "44 or 45"),
    CL("CL", "Coil", null, null, "14"),
    CM("CM", "Card", null, "A flat package usually made of fibreboard from/to which product is often hung or attached.", "67"),
    CN("CN", "Container, not otherwise specified as transport equipment", null, null, "25"),
    CO("CO", "Carboy, non-protected", null, null, "43"),
    CP("CP", "Carboy, protected", null, null, "43"),
    CQ("CQ", "Cartridge", null, "Package containing a charge such as propelling explosive for firearms or ink toner for a printer.", "92"),
    CR("CR", "Crate", null, null, "24 to 25"),
    CS("CS", "Case", null, null, "21 to 25"),
    CT("CT", "Carton", null, null, "22 to 24"),
    CU("CU", "Cup", null, null, "51"),
    CV("CV", "Cover", null, null, "67"),
    CW("CW", "Cage, roll", null, null, "26"),
    CX("CX", "Can, cylindrical", null, null, "32"),
    CY("CY", "Cylinder", null, null, "12"),
    CZ("CZ", "Canvas", null, null, "67"),
    DA("DA", "Crate, multiple layer, plastic", null, null, "23 to 25 or 27"),
    DB("DB", "Crate, multiple layer, wooden", null, null, "23 to 25 or 27"),
    DC("DC", "Crate, multiple layer, cardboard", null, null, "23 to 25 or 27"),
    DG("DG", "Cage, Commonwealth Handling Equipment Pool  (CHEP)", null, null, "26"),
    DH("DH", "Box, Commonwealth Handling Equipment Pool (CHEP), Eurobox", null, "A box mounted on a pallet base under the control of CHEP.", "27"),
    DI("DI", "Drum, iron", null, null, "34"),
    DJ("DJ", "Demijohn, non-protected", null, null, "43"),
    DK("DK", "Crate, bulk, cardboard", null, null, "23 to 25 or 27"),
    DL("DL", "Crate, bulk, plastic", null, null, "23 to 25 or 27"),
    DM("DM", "Crate, bulk, wooden", null, null, "23 to 25 or 27"),
    DN("DN", "Dispenser", null, null, "93"),
    DP("DP", "Demijohn, protected", null, null, "43"),
    DR("DR", "Drum", null, null, "34"),
    DS("DS", "Tray, one layer no cover, plastic", null, null, "27"),
    DT("DT", "Tray, one layer no cover, wooden", null, null, "27"),
    DU("DU", "Tray, one layer no cover, polystyrene", null, null, "27"),
    DV("DV", "Tray, one layer no cover, cardboard", null, null, "27"),
    DW("DW", "Tray, two layers no cover, plastic tray", null, null, "27 or 29"),
    DX("DX", "Tray, two layers no cover, wooden", null, null, "27 or 29"),
    DY("DY", "Tray, two layers no cover, cardboard", null, null, "27 or 29"),
    EC("EC", "Bag, plastic", null, null, "62 to 64"),
    ED("ED", "Case, with pallet base", null, null, "23 to 25"),
    EE("EE", "Case, with pallet base, wooden", null, null, "23 to 25"),
    EF("EF", "Case, with pallet base, cardboard", null, null, "23 to 25"),
    EG("EG", "Case, with pallet base, plastic", null, null, "23 to 25"),
    EH("EH", "Case, with pallet base, metal", null, null, "23 to 25"),
    EI("EI", "Case, isothermic", null, null, "22 to 25"),
    EN("EN", "Envelope", null, null, "67"),
    FB("FB", "Flexibag", null, "A flexible containment bag made of plastic, typically for the transportation bulk non-hazardous cargoes using standard size shipping containers.", "65"),
    FC("FC", "Crate, fruit", null, null, "23 to 27"),
    FD("FD", "Crate, framed", null, null, "26"),
    FE("FE", "Flexitank", null, "A flexible containment tank made of plastic, typically for the transportation bulk non-hazardous cargoes using standard size shipping containers.", "65"),
    FI("FI", "Firkin", null, null, "44 or 45"),
    FL("FL", "Flask", null, null, "42 or 43"),
    FO("FO", "Footlocker", null, null, "23"),
    FP("FP", "Filmpack", null, null, "67"),
    FR("FR", "Frame", null, null, "26"),
    FT("FT", "Foodtainer", null, null, "21 to 23"),
    FW("FW", "Cart, flatbed", null, "Wheeled flat bedded device on which trays or other regular shaped items are packed for transportation purposes.", "94"),
    FX("FX", "Bag, flexible container", null, null, "61 to 66"),
    GB("GB", "Bottle, gas", null, "A narrow-necked metal cylinder for retention of liquefied or compressed gas.", "31 or 35"),
    GI("GI", "Girder", null, null, "16"),
    GL("GL", "Container, gallon", null, "A container with a capacity of one gallon.", "32"),
    GR("GR", "Receptacle, glass", null, "Containment vessel made of glass for retaining substances or articles.", "21 to 23 or 31 to 33 or 41 to 43"),
    GU("GU", "Tray, containing horizontally stacked flat items", null, "Tray containing flat items stacked on top of one another.", "27"),
    GY("GY", "Bag, gunny", null, "A sack made of gunny or burlap, used for transporting coarse commodities, such as grains, potatoes, and other agricultural products.", "63 to 64"),
    GZ("GZ", "Girders, in bundle/bunch/truss", null, null, "16"),
    HA("HA", "Basket, with handle, plastic", null, null, "27"),
    HB("HB", "Basket, with handle, wooden", null, null, "27"),
    HC("HC", "Basket, with handle, cardboard", null, null, "27"),
    HG("HG", "Hogshead", null, null, "44 or 45"),
    HN("HN", "Hanger", null, "A purpose shaped device with a hook at the top for hanging items from a rail.", "93"),
    HR("HR", "Hamper", null, null, "23"),
    IA("IA", "Package, display, wooden", null, null, "21 to 23"),
    IB("IB", "Package, display, cardboard", null, null, "21 to 23"),
    IC("IC", "Package, display, plastic", null, null, "21 to 23"),
    ID("ID", "Package, display, metal", null, null, "21 to 23"),
    IE("IE", "Package, show", null, null, "21 to 23"),
    IF("IF", "Package, flow", null, "A flexible tubular package or skin, possibly transparent, often used for containment of foodstuffs (e.g. salami sausage).", "61 or 62"),
    IG("IG", "Package, paper wrapped", null, null, "21 to 23"),
    IH("IH", "Drum, plastic", null, null, "34"),
    IK("IK", "Package, cardboard, with bottle grip-holes", null, "Packaging material made out of cardboard that facilitates the separation of individual glass or plastic bottles.", "21 to 23"),
    IL("IL", "Tray, rigid, lidded stackable (CEN TS 14482:2002)", null, "Lidded stackable rigid tray compliant with CEN TS 14482:2002.", "27"),
    IN("IN", "Ingot", null, null, "17"),
    IZ("IZ", "Ingots, in bundle/bunch/truss", null, null, "17"),
    JB("JB", "Bag, jumbo", null, "A flexible containment bag, widely used for storage, transportation and handling of powder, flake or granular materials. Typically constructed from woven polypropylene (PP) fabric in the form of cubic bags.", "65"),
    JC("JC", "Jerrican, rectangular", null, null, "23"),
    JG("JG", "Jug", null, null, "41"),
    JR("JR", "Jar", null, null, "41"),
    JT("JT", "Jutebag", null, null, "61 or 65"),
    JY("JY", "Jerrican, cylindrical", null, null, "33"),
    KG("KG", "Keg", null, null, "44 or 45"),
    KI("KI", "Kit", null, "A set of articles or implements used for a specific purpose.", "92"),
    LE("LE", "Luggage", null, "A collection of bags, cases and/or containers which hold personal belongings for a journey.", "21 to 23 or 61 to 63"),
    LG("LG", "Log", null, null, "12"),
    LT("LT", "Lot", null, null, "01 to 03"),
    LU("LU", "Lug", null, "A wooden box for the transportation and storage of fruit or vegetables.", "23"),
    LV("LV", "Liftvan", null, "A wooden or metal container used for packing household goods and personal effects.", "22 to 24"),
    LZ("LZ", "Logs, in bundle/bunch/truss", null, null, "12"),
    MA("MA", "Crate, metal", null, "Containment box made of metal for retaining substances or articles.", "23 to 25 or 27"),
    MB("MB", "Bag, multiply", null, null, "62 to 64"),
    MC("MC", "Crate, milk", null, null, "27"),
    ME("ME", "Container, metal", null, "A type of containment box made of metal for retaining substances or articles, not otherwise specified as transport equipment.", "23 to 25 or 27"),
    MR("MR", "Receptacle, metal", null, "Containment vessel made of metal for retaining substances or articles.", "21 to 23 or 31 to 33"),
    MS("MS", "Sack, multi-wall", null, null, "62 to 64"),
    MT("MT", "Mat", null, null, "67"),
    MW("MW", "Receptacle, plastic wrapped", null, "Containment vessel wrapped with plastic for retaining substances or articles.", "21 to 23 or 31 to 33 or 41 to 43 or 61 to 63"),
    MX("MX", "Matchbox", null, null, "21"),
    NA("NA", "Not available", null, null, "0"),
    NE("NE", "Unpacked or unpackaged", null, null, "0"),
    NF("NF", "Unpacked or unpackaged, single unit", null, null, "0"),
    NG("NG", "Unpacked or unpackaged, multiple units", null, null, "0"),
    NS("NS", "Nest", null, null, "24"),
    NT("NT", "Net", null, null, "66"),
    NU("NU", "Net, tube, plastic", null, null, "66"),
    NV("NV", "Net, tube, textile", null, null, "66"),
    OA("OA", "Pallet, CHEP 40 cm x 60 cm", null, "Commonwealth Handling Equipment Pool (CHEP) standard pallet of dimensions 40 centimeters x 60 centimeters.", "92"),
    OB("OB", "Pallet, CHEP 80 cm x 120 cm", null, "Commonwealth Handling Equipment Pool (CHEP) standard pallet of dimensions 80 centimeters x 120 centimeters.", "92"),
    OC("OC", "Pallet, CHEP 100 cm x 120 cm", null, "Commonwealth Handling Equipment Pool (CHEP) standard pallet of dimensions 100 centimeters x 120 centimeters.", "92"),
    OD("OD", "Pallet, AS 4068-1993", null, "Australian standard pallet of dimensions 115.5 centimeters x 116.5 centimeters.", "92"),
    OE("OE", "Pallet, ISO T11", null, "ISO standard pallet of dimensions 110 centimeters x 110 centimeters, prevalent in Asia - Pacific region.", "92"),
    OF("OF", "Platform, unspecified weight or dimension", null, "A pallet equivalent shipping platform of unknown dimensions or unknown weight.", "92"),
    OK("OK", "Block", null, "A solid piece of a hard substance, such as granite, having one or more flat sides.", "17"),
    OT("OT", "Octabin", null, "A standard cardboard container of large dimensions for storing for example vegetables, granules of plastics or other dry products.", "25"),
    OU("OU", "Container, outer", null, "A type of containment box that serves as the outer shipping container, not otherwise specified as transport equipment.", "23 to 25 or 27"),
    P2("P2", "Pan", null, "A shallow, wide, open container, usually of metal.", "51"),
    PA("PA", "Packet", null, "Small package.", "21 to 23"),
    PB("PB", "Pallet, box Combined open-ended box and pallet", null, null, "92"),
    PC("PC", "Parcel", null, null, "21 to 23 or 61 to 63"),
    PD("PD", "Pallet, modular, collars 80cms * 100cms", null, "Standard sized pallet of dimensions 80 centimeters by 100 centimeters (cms).", "92"),
    PE("PE", "Pallet, modular, collars 80cms * 120cms", null, "Standard sized pallet of dimensions 80 centimeters by 120 centimeters (cms).", "92"),
    PF("PF", "Pen", null, "A small open top enclosure for retaining animals.", "26 or 27"),
    PG("PG", "Plate", null, null, "15"),
    PH("PH", "Pitcher", null, null, "41"),
    PI("PI", "Pipe", null, null, "11"),
    PJ("PJ", "Punnet", null, null, "27"),
    PK("PK", "Package", null, "Standard packaging unit.", "21 to 23"),
    PL("PL", "Pail", null, null, "51"),
    PN("PN", "Plank", null, null, "16"),
    PO("PO", "Pouch", null, null, "61"),
    PP("PP", "Piece", null, "A loose or unpacked article.", "19"),
    PR("PR", "Receptacle, plastic", null, "Containment vessel made of plastic for retaining substances or articles.", "21 to 23 or 31 to 33 or 41 to 43 or 61 to 63"),
    PT("PT", "Pot", null, null, "41"),
    PU("PU", "Tray", null, null, "27"),
    PV("PV", "Pipes, in bundle/bunch/truss", null, null, "11"),
    PX("PX", "Pallet", null, "Platform or open-ended box, usually made of wood, on which goods are retained for ease of mechanical handling during transport and storage.", "92"),
    PY("PY", "Plates, in bundle/bunch/truss", null, null, "15"),
    PZ("PZ", "Planks, in bundle/bunch/truss", null, null, "16"),
    QA("QA", "Drum, steel, non-removable head", null, null, "34"),
    QB("QB", "Drum, steel, removable head", null, null, "34"),
    QC("QC", "Drum, aluminium, non-removable head", null, null, "34"),
    QD("QD", "Drum, aluminium, removable head", null, null, "34"),
    QF("QF", "Drum, plastic, non-removable head", null, null, "34"),
    QG("QG", "Drum, plastic, removable head", null, null, "34"),
    QH("QH", "Barrel, wooden, bung type", null, null, "44 or 45"),
    QJ("QJ", "Barrel, wooden, removable head", null, null, "44 or 45"),
    QK("QK", "Jerrican, steel, non-removable head", null, null, "23 or 33"),
    QL("QL", "Jerrican, steel, removable head", null, null, "23 or 33"),
    QM("QM", "Jerrican, plastic, non-removable head", null, null, "23 or 33"),
    QN("QN", "Jerrican, plastic, removable head", null, null, "23 or 33"),
    QP("QP", "Box, wooden, natural wood, ordinary", null, null, "21 to 25"),
    QQ("QQ", "Box, wooden, natural wood, with sift proof walls", null, null, "21 to 25"),
    QR("QR", "Box, plastic, expanded", null, null, "21 to 25"),
    QS("QS", "Box, plastic, solid", null, null, "21 to 25"),
    RD("RD", "Rod", null, null, "12"),
    RG("RG", "Ring", null, null, "14"),
    RJ("RJ", "Rack, clothing hanger", null, null, "93"),
    RK("RK", "Rack", null, null, "93"),
    RL("RL", "Reel", null, "Cylindrical rotatory device with a rim at each end on which materials are wound.", "91"),
    RO("RO", "Roll", null, null, "13"),
    RT("RT", "Rednet", null, "Containment material made of red mesh netting for retaining articles (e.g. trees).", "66"),
    RZ("RZ", "Rods, in bundle/bunch/truss", null, null, "12"),
    SA("SA", "Sack", null, null, "65"),
    SB("SB", "Slab", null, null, "16 or 17"),
    SC("SC", "Crate, shallow", null, null, "27"),
    SD("SD", "Spindle", null, null, "91"),
    SE("SE", "Sea-chest", null, null, "22 or 23"),
    SH("SH", "Sachet", null, null, "61"),
    SI("SI", "Skid", null, "A low movable platform or pallet to facilitate the handling and transport of goods.", "92"),
    SK("SK", "Case, skeleton", null, null, "26"),
    SL("SL", "Slipsheet", null, "Hard plastic sheeting primarily used as the base on which to stack goods to optimise the space within a container. May be used as an alternative to a palletized packaging.", "67"),
    SM("SM", "Sheetmetal", null, null, "15"),
    SO("SO", "Spool", null, "A packaging container used in the transport of such items as wire, cable, tape and yarn.", "91"),
    SP("SP", "Sheet, plastic wrapping", null, null, "15"),
    SS("SS", "Case, steel", null, null, "21 to 25"),
    ST("ST", "Sheet", null, null, "15"),
    SU("SU", "Suitcase", null, null, "21 to 23 or 61 to 63"),
    SV("SV", "Envelope, steel", null, null, "67"),
    SW("SW", "Shrinkwrapped", null, "Goods retained in a transparent plastic film that has been wrapped around and then shrunk tightly on to the goods.", "67"),
    SX("SX", "Set", "X", null, "11 to 45"),
    SY("SY", "Sleeve", null, null, "69"),
    SZ("SZ", "Sheets, in bundle/bunch/truss", null, null, "15"),
    T1("T1", "Tablet", null, "A loose or unpacked article in the form of a bar, block or piece.", "16"),
    TB("TB", "Tub", null, null, "51"),
    TC("TC", "Tea-chest", null, null, "21 to 23"),
    TD("TD", "Tube, collapsible", null, null, "61 to 65"),
    TE("TE", "Tyre", null, "A ring made of rubber and/or metal surrounding a wheel.", "93"),
    TG("TG", "Tank container, generic", null, "A specially constructed container for transporting liquids and gases in bulk.", "93"),
    TI("TI", "Tierce", null, null, "44"),
    TK("TK", "Tank, rectangular", null, null, "24 or 25"),
    TL("TL", "Tub, with lid", null, null, "51"),
    TN("TN", "Tin", null, null, "21 or 22"),
    TO("TO", "Tun", null, null, "44 or 45"),
    TR("TR", "Trunk", null, null, "24 or 25"),
    TS("TS", "Truss", null, null, "16"),
    TT("TT", "Bag, tote", null, "A capacious bag or basket.", "62 or 63"),
    TU("TU", "Tube", null, null, "11"),
    TV("TV", "Tube, with nozzle", null, "A tube made of plastic, metal or cardboard fitted with a nozzle, containing a liquid or semi-liquid product, e.g. silicon.", "31 or 32"),
    TW("TW", "Pallet, triwall", null, "A lightweight pallet made from heavy duty corrugated board.", "92"),
    TY("TY", "Tank, cylindrical", null, null, "34 or 35"),
    TZ("TZ", "Tubes, in bundle/bunch/truss", null, null, "11"),
    UC("UC", "Uncaged", null, null, "0"),
    UN("UN", "Unit", null, "A type of package composed of a single item or object, not otherwise specified as a unit of transport equipment.", "23 to 25 or 27"),
    VA("VA", "Vat", null, null, "35"),
    VG("VG", "Bulk, gas (at 1031 mbar and 15\u00b0C)", null, null, "6"),
    VI("VI", "Vial", null, null, "31"),
    VK("VK", "Vanpack", null, "A type of wooden crate.", "99"),
    VL("VL", "Bulk, liquid", null, null, "4"),
    VO("VO", "Bulk, solid, large particles (\u0093nodules\u0094)", null, null, "3"),
    VP("VP", "Vacuum-packed", null, null, "67"),
    VQ("VQ", "Bulk, liquefied gas (at abnormal temperature/pressure)", null, null, "5"),
    VN("VN", "Vehicle", null, "A self-propelled means of conveyance.", "93"),
    VR("VR", "Bulk, solid, granular particles (\u0093grains\u0094)", null, null, "2"),
    VS("VS", "Bulk, scrap metal", null, "Loose or unpacked scrap metal transported in bulk form.", "9"),
    VY("VY", "Bulk, solid, fine particles (\u0093powders\u0094)", null, null, "1"),
    WA("WA", "Intermediate bulk container", null, "A reusable container made of metal, plastic, textile, wood or composite materials used to facilitate transportation of bulk solids and liquids in manageable volumes.", "23 to 26 or 62 to 64"),
    WB("WB", "Wickerbottle", null, null, "42 or 43"),
    WC("WC", "Intermediate bulk container, steel", null, null, "23 to 26"),
    WD("WD", "Intermediate bulk container, aluminium", null, null, "23 to 26"),
    WF("WF", "Intermediate bulk container, metal", null, null, "23 to 26"),
    WG("WG", "Intermediate bulk container, steel, pressurised > 10 kpa", null, null, "23 to 26"),
    WH("WH", "Intermediate bulk container, aluminium, pressurised > 10 kpa", null, null, "23 to 26"),
    WJ("WJ", "Intermediate bulk container, metal, pressure 10 kpa", null, null, "23 to 26"),
    WK("WK", "Intermediate bulk container, steel, liquid", null, null, "23 to 26"),
    WL("WL", "Intermediate bulk container, aluminium, liquid", null, null, "23 to 26"),
    WM("WM", "Intermediate bulk container, metal, liquid", null, null, "23 to 26"),
    WN("WN", "Intermediate bulk container, woven plastic, without coat/liner", null, null, "62 to 64"),
    WP("WP", "Intermediate bulk container, woven plastic, coated", null, null, "62 to 64"),
    WQ("WQ", "Intermediate bulk container, woven plastic, with liner", null, null, "62 to 64"),
    WR("WR", "Intermediate bulk container, woven plastic, coated and liner", null, null, "62 to 64"),
    WS("WS", "Intermediate bulk container, plastic film", null, null, "62 to 64"),
    WT("WT", "Intermediate bulk container, textile with out coat/liner", null, null, "62 to 64"),
    WU("WU", "Intermediate bulk container, natural wood, with inner liner", null, null, "23 to 26"),
    WV("WV", "Intermediate bulk container, textile, coated", null, null, "62 to 64"),
    WW("WW", "Intermediate bulk container, textile, with liner", null, null, "62 to 64"),
    WX("WX", "Intermediate bulk container, textile, coated and liner", null, null, "62 to 64"),
    WY("WY", "Intermediate bulk container, plywood, with inner liner", null, null, "23 to 26"),
    WZ("WZ", "Intermediate bulk container, reconstituted wood, with inner liner", null, null, "23 to 26"),
    XA("XA", "Bag, woven plastic, without inner coat/liner", null, null, "62 to 64"),
    XB("XB", "Bag, woven plastic, sift proof", null, null, "62 to 64"),
    XC("XC", "Bag, woven plastic, water resistant", null, null, "62 to 64"),
    XD("XD", "Bag, plastics film", null, null, "62 to 64"),
    XF("XF", "Bag, textile, without inner coat/liner", null, null, "62 to 64"),
    XG("XG", "Bag, textile, sift proof", null, null, "62 to 64"),
    XH("XH", "Bag, textile, water resistant", null, null, "62 to 64"),
    XJ("XJ", "Bag, paper, multi-wall", null, null, "62 to 64"),
    XK("XK", "Bag, paper, multi-wall, water resistant", null, null, "62 to 64"),
    YA("YA", "Composite packaging, plastic receptacle in steel drum", null, null, "33 or 34"),
    YB("YB", "Composite packaging, plastic receptacle in steel crate box", null, null, "24 or 25"),
    YC("YC", "Composite packaging, plastic receptacle in aluminium drum", null, null, "33 or 34"),
    YD("YD", "Composite packaging, plastic receptacle in aluminium crate", null, null, "24 or 25"),
    YF("YF", "Composite packaging, plastic receptacle in wooden box", null, null, "24 or 25"),
    YG("YG", "Composite packaging, plastic receptacle in plywood drum", null, null, "33 or 34"),
    YH("YH", "Composite packaging, plastic receptacle in plywood box", null, null, "24 or 25"),
    YJ("YJ", "Composite packaging, plastic receptacle in fibre drum", null, null, "33 or 34"),
    YK("YK", "Composite packaging, plastic receptacle in fibreboard box", null, null, "24 or 25"),
    YL("YL", "Composite packaging, plastic receptacle in plastic drum", null, null, "33 or 34"),
    YM("YM", "Composite packaging, plastic receptacle in solid plastic box", null, null, "24 or 25"),
    YN("YN", "Composite packaging, glass receptacle in steel drum", null, null, "33 or 34"),
    YP("YP", "Composite packaging, glass receptacle in steel crate box", null, null, "24 or 25"),
    YQ("YQ", "Composite packaging, glass receptacle in aluminium drum", null, null, "33 or 34"),
    YR("YR", "Composite packaging, glass receptacle in aluminium crate", null, null, "24 or 25"),
    YS("YS", "Composite packaging, glass receptacle in wooden box", null, null, "24 or 25"),
    YT("YT", "Composite packaging, glass receptacle in plywood drum", null, null, "33 or 34"),
    YV("YV", "Composite packaging, glass receptacle in wickerwork hamper", null, null, "23"),
    YW("YW", "Composite packaging, glass receptacle in fibre drum", null, null, "33 or 34"),
    YX("YX", "Composite packaging, glass receptacle in fibreboard box", null, null, "24 or 25"),
    YY("YY", "Composite packaging, glass receptacle in expandable plastic pack", null, null, "62 or 63"),
    YZ("YZ", "Composite packaging, glass receptacle in solid plastic pack", null, null, "23 or 24"),
    ZA("ZA", "Intermediate bulk container, paper, multi-wall", null, null, "62 to 64"),
    ZB("ZB", "Bag, large", null, null, "62 to 64"),
    ZC("ZC", "Intermediate bulk container, paper, multi-wall, water resistant", null, null, "62 to 64"),
    ZD("ZD", "Intermediate bulk container, rigid plastic, with structural equipment, solids", null, null, "23 to 26"),
    ZF("ZF", "Intermediate bulk container, rigid plastic, freestanding, solids", null, null, "23 to 26"),
    ZG("ZG", "Intermediate bulk container, rigid plastic, with structural equipment, pressurised", null, null, "23 to 26"),
    ZH("ZH", "Intermediate bulk container, rigid plastic, freestanding, pressurised", null, null, "23 to 26"),
    ZJ("ZJ", "Intermediate bulk container, rigid plastic, with structural equipment, liquids", null, null, "23 to 26"),
    ZK("ZK", "Intermediate bulk container, rigid plastic, freestanding, liquids", null, null, "23 to 26"),
    ZL("ZL", "Intermediate bulk container, composite, rigid plastic, solids", null, null, "23 to 26"),
    ZM("ZM", "Intermediate bulk container, composite, flexible plastic, solids", null, null, "62 to 64"),
    ZN("ZN", "Intermediate bulk container, composite, rigid plastic, pressurised", null, null, "23 to 26"),
    ZP("ZP", "Intermediate bulk container, composite, flexible plastic, pressurised", null, null, "62 to 64"),
    ZQ("ZQ", "Intermediate bulk container, composite, rigid plastic, liquids", null, null, "23 to 26"),
    ZR("ZR", "Intermediate bulk container, composite, flexible plastic, liquids", null, null, "62 to 64"),
    ZS("ZS", "Intermediate bulk container, composite", null, null, "23 to 26 or 62 to 64"),
    ZT("ZT", "Intermediate bulk container, fibreboard", null, null, "23 to 26"),
    ZU("ZU", "Intermediate bulk container, flexible", null, null, "23 to 26"),
    ZV("ZV", "Intermediate bulk container, metal, other than steel", null, null, "23 to 26"),
    ZW("ZW", "Intermediate bulk container, natural wood", null, null, "23 to 26"),
    ZX("ZX", "Intermediate bulk container, plywood", null, null, "23 to 26"),
    ZY("ZY", "Intermediate bulk container, reconstituted wood", null, null, "23 to 26"),
    ZZ("ZZ", "Mutually defined", null, null, "0");
    private final String m_sID;
    private final String m_sDisplayName;
    private final String m_sStatus;
    private final String m_sDescription;
    private final String m_sNumeric;

    private EPackagingTypeCode21(
        @Nonnull
        @Nonempty
        final String sID,
        @Nonnull
        final String sDisplayName,
        @Nullable
        final String sStatus,
        @Nullable
        final String sDescription,
        @Nullable
        final String sNumeric) {
        m_sID = sID;
        m_sDisplayName = sDisplayName;
        m_sStatus = sStatus;
        m_sDescription = sDescription;
        m_sNumeric = sNumeric;
    }

    @Nonnull
    @Nonempty
    public String getID() {
        return m_sID;
    }

    @Nonnull
    public String getDisplayName() {
        return m_sDisplayName;
    }

    @Nullable
    public String getStatus() {
        return m_sStatus;
    }

    @Nullable
    public String getDescription() {
        return m_sDescription;
    }

    @Nullable
    public String getNumeric() {
        return m_sNumeric;
    }

    @Nullable
    public static EPackagingTypeCode21 getFromIDOrNull(
        @Nullable
        final String sID) {
        return EnumHelper.getFromIDOrNull(EPackagingTypeCode21 .class, sID);
    }

    @Nullable
    public static String getDisplayNameFromIDOrNull(
        @Nullable
        final String sID) {
        final EPackagingTypeCode21 eValue = EPackagingTypeCode21 .getFromIDOrNull(sID);
        return ((eValue == null)?null:eValue.getDisplayName());
    }
}
