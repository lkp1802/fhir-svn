package org.hl7.fhir.tools.implementations.csharp;
/*
Copyright (c) 2011+, HL7, Inc
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this 
   list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, 
   this list of conditions and the following disclaimer in the documentation 
   and/or other materials provided with the distribution.
 * Neither the name of HL7 nor the names of its contributors may be used to 
   endorse or promote products derived from this software without specific 
   prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.

 */
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.hl7.fhir.definitions.model.Definitions;
import org.hl7.fhir.dstu3.utils.Version;
import org.hl7.fhir.dstu3.validation.ValidationMessage;
import org.hl7.fhir.tools.implementations.BaseGenerator;
import org.hl7.fhir.tools.implementations.GeneratorUtils;
import org.hl7.fhir.tools.publisher.DotNetFramework;
import org.hl7.fhir.tools.publisher.DotNetFramework.DotNetCompileResult;
import org.hl7.fhir.tools.publisher.FolderManager;
import org.hl7.fhir.tools.publisher.PlatformGenerator;
import org.hl7.fhir.utilities.CSFile;
import org.hl7.fhir.utilities.Logger;
import org.hl7.fhir.utilities.Logger.LogMessageType;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.utilities.ZipGenerator;

public class CSharpGenerator extends BaseGenerator implements PlatformGenerator {

  @Override
  public void generate(Definitions definitions, String destDir, String implDir, String version, Date genDate, Logger logger, String svnRevision) throws Exception {
  }

  @Override
  public String getName() {
    return "csharp";
  }


  @Override
  public String getDescription(String version, String svnRevision) {
    return "Object models, Parsers/Serialisers, Validators, and a Client. The source code for that compiled .NET library can be found on GitHub at " +
        "[http://github.com/ewoutkramer/fhir-net-api](http://github.com/ewoutkramer/fhir-net-api)";
  }

  @Override
  public String getTitle() {
    return "csharp";
  }


  @Override
  public String getVersion() {
    return Version.VERSION;
  }

  @Override
  public String getReference(String version) {
    return "http://www.nuget.org/packages/Hl7.Fhir";
  }

  public String getZipFilename(String version) {
    return super.getReference(version);
  }

  private Logger logger = null;


  @Override
  public boolean doesCompile() {
    return false;
  }


  @Override
  public boolean compile(String rootDir, List<String> errors, Logger logger, List<ValidationMessage> issues) 
  {
    return false;
  }

  @Override
  public boolean doesTest() {
    return false;
  }

  @Override
  public void loadAndSave(FolderManager folders, String sourceFile, String destFile) {
  }

  @Override
  public String checkFragments(FolderManager folders, String fragments) throws Exception {
    return "Not supported by C# implementation";
  }

  @Override
  public void test(FolderManager folders, Collection<String> names) throws Exception {
    throw new Error("This should not be called");
  }
}
