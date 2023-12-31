package com.example;

import io.micronaut.core.optim.StaticOptimizations;
import io.micronaut.core.util.EnvironmentProperties;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvironmentPropertiesOptimizationLoader implements StaticOptimizations.Loader<EnvironmentProperties> {
  private void load0(Map<String, List<String>> env) {
    env.put("USERDOMAIN_ROAMINGPROFILE", Arrays.asList("userdomain.roamingprofile", "userdomain-roamingprofile"));
    env.put("LOCALAPPDATA", Arrays.asList("localappdata"));
    env.put("PROCESSOR_LEVEL", Arrays.asList("processor.level", "processor-level"));
    env.put("USERDOMAIN", Arrays.asList("userdomain"));
    env.put("LOGONSERVER", Arrays.asList("logonserver"));
    env.put("FPS_BROWSER_APP_PROFILE_STRING", Arrays.asList("fps.browser.app.profile.string", "fps.browser.app.profile-string", "fps.browser.app-profile.string", "fps.browser.app-profile-string", "fps.browser-app.profile.string", "fps.browser-app.profile-string", "fps.browser-app-profile.string", "fps.browser-app-profile-string", "fps-browser.app.profile.string", "fps-browser.app.profile-string", "fps-browser.app-profile.string", "fps-browser.app-profile-string", "fps-browser-app.profile.string", "fps-browser-app.profile-string", "fps-browser-app-profile.string", "fps-browser-app-profile-string"));
    env.put("JAVA_HOME", Arrays.asList("java.home", "java-home"));
    env.put("SESSIONNAME", Arrays.asList("sessionname"));
    env.put("ALLUSERSPROFILE", Arrays.asList("allusersprofile"));
    env.put("PROCESSOR_ARCHITECTURE", Arrays.asList("processor.architecture", "processor-architecture"));
    env.put("PSModulePath", Arrays.asList("psmodulepath"));
    env.put("SystemDrive", Arrays.asList("systemdrive"));
    env.put("EFC_10204", Arrays.asList("efc.10204", "efc-10204"));
    env.put("OneDrive", Arrays.asList("onedrive"));
    env.put("MAVEN_HOME", Arrays.asList("maven.home", "maven-home"));
    env.put("APPDATA", Arrays.asList("appdata"));
    env.put("USERNAME", Arrays.asList("username"));
    env.put("ProgramFiles(x86)", Arrays.asList("programfiles(x86)"));
    env.put("VBOX_MSI_INSTALL_PATH", Arrays.asList("vbox.msi.install.path", "vbox.msi.install-path", "vbox.msi-install.path", "vbox.msi-install-path", "vbox-msi.install.path", "vbox-msi.install-path", "vbox-msi-install.path", "vbox-msi-install-path"));
    env.put("Path", Arrays.asList("path"));
    env.put("CommonProgramFiles", Arrays.asList("commonprogramfiles"));
    env.put("FPS_BROWSER_USER_PROFILE_STRING", Arrays.asList("fps.browser.user.profile.string", "fps.browser.user.profile-string", "fps.browser.user-profile.string", "fps.browser.user-profile-string", "fps.browser-user.profile.string", "fps.browser-user.profile-string", "fps.browser-user-profile.string", "fps.browser-user-profile-string", "fps-browser.user.profile.string", "fps-browser.user.profile-string", "fps-browser.user-profile.string", "fps-browser.user-profile-string", "fps-browser-user.profile.string", "fps-browser-user.profile-string", "fps-browser-user-profile.string", "fps-browser-user-profile-string"));
    env.put("PATHEXT", Arrays.asList("pathext"));
    env.put("OS", Arrays.asList("os"));
    env.put("DriverData", Arrays.asList("driverdata"));
    env.put("OneDriveConsumer", Arrays.asList("onedriveconsumer"));
    env.put("COMPUTERNAME", Arrays.asList("computername"));
    env.put("IntelliJ IDEA Community Edition", Arrays.asList("intellij idea community edition"));
    env.put("PROCESSOR_REVISION", Arrays.asList("processor.revision", "processor-revision"));
    env.put("CommonProgramW6432", Arrays.asList("commonprogramw6432"));
    env.put("ComSpec", Arrays.asList("comspec"));
    env.put("PyCharm Community Edition", Arrays.asList("pycharm community edition"));
    env.put("ProgramData", Arrays.asList("programdata"));
    env.put("ProgramW6432", Arrays.asList("programw6432"));
    env.put("TEMP", Arrays.asList("temp"));
    env.put("SystemRoot", Arrays.asList("systemroot"));
    env.put("HOMEPATH", Arrays.asList("homepath"));
    env.put("USERPROFILE", Arrays.asList("userprofile"));
    env.put("HOMEDRIVE", Arrays.asList("homedrive"));
    env.put("PROCESSOR_IDENTIFIER", Arrays.asList("processor.identifier", "processor-identifier"));
    env.put("TMP", Arrays.asList("tmp"));
    env.put("CommonProgramFiles(x86)", Arrays.asList("commonprogramfiles(x86)"));
    env.put("PUBLIC", Arrays.asList("public"));
    env.put("ProgramFiles", Arrays.asList("programfiles"));
    env.put("NUMBER_OF_PROCESSORS", Arrays.asList("number.of.processors", "number.of-processors", "number-of.processors", "number-of-processors"));
    env.put("windir", Arrays.asList("windir"));
    env.put("IDEA_INITIAL_DIRECTORY", Arrays.asList("idea.initial.directory", "idea.initial-directory", "idea-initial.directory", "idea-initial-directory"));
    env.put("=::", Arrays.asList("=::"));
    env.put("ZES_ENABLE_SYSMAN", Arrays.asList("zes.enable.sysman", "zes.enable-sysman", "zes-enable.sysman", "zes-enable-sysman"));
  }

  @Override
  public EnvironmentProperties load() {
    Map<String, List<String>> env = new HashMap<String, List<String>>();
    load0(env);
    return EnvironmentProperties.of(env);
  }
}
