package org.igorski.junit5.listeners;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.reporting.ReportEntry;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

import java.util.Set;

public class TestListingListener implements TestExecutionListener {
    private long startTime = 0L;

    public void testPlanExecutionStarted(TestPlan testPlan) {
        System.out.println("=============================================");
        startTime = System.currentTimeMillis();
        Set<TestIdentifier> roots = testPlan.getRoots();

        for(TestIdentifier testIdentifier : roots) {
            Set<TestIdentifier> children = testPlan.getChildren(testIdentifier.getUniqueId());
            printInfo(children, testPlan);
        }
    }

    private void printInfo(Set<TestIdentifier> children, TestPlan testPlan) {
        for(TestIdentifier child : children) {
            if(child.isTest()) {
                System.out.println("        Test name: " + child.getDisplayName());
            } else {
                System.out.println("    Container name: " + child.getDisplayName());
                printInfo(testPlan.getChildren(child.getUniqueId()), testPlan);
            }
        }
    }

    public void testPlanExecutionFinished(TestPlan testPlan) {

    }

    public void dynamicTestRegistered(TestIdentifier testIdentifier) {
    }

    public void executionSkipped(TestIdentifier testIdentifier, String reason) {
    }

    public void executionStarted(TestIdentifier testIdentifier) {
    }

    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
    }

    public void reportingEntryPublished(TestIdentifier testIdentifier, ReportEntry entry) {
    }
}
