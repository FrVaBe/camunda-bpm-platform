/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.engine.history;

import org.camunda.bpm.engine.query.Query;

/**
 * Allows programmatic querying of {@link HistoricDecisionInstance}s.
 *
 * @author Philipp Ossler
 */
public interface HistoricDecisionInstanceQuery extends Query<HistoricDecisionInstanceQuery, HistoricDecisionInstance> {

  /** Only select historic decision instances for the given decision definition */
  HistoricDecisionInstanceQuery decisionDefinitionId(String decisionDefinitionId);

  /** Only select historic decision instances with the given key of the decision definition. */
  HistoricDecisionInstanceQuery decisionDefinitionKey(String decisionDefinitionKey);

  /** Only select historic decision instances with the given name of the decision definition. */
  HistoricDecisionInstanceQuery decisionDefinitionName(String decisionDefinitionName);

  /** Only select historic decision instances that are evaluated inside a process
   * with the given process definition key. */
  HistoricDecisionInstanceQuery processDefinitionKey(String processDefinitionKey);

  /** Only select historic decision instances that are evaluated inside a process
   * with the given process definition id. */
  HistoricDecisionInstanceQuery processDefinitionId(String processDefinitionId);

  /** Only select historic decision instances that are evaluated inside a process
   * with the given process instance id. */
  HistoricDecisionInstanceQuery processInstanceId(String processInstanceId);

  /** Only select historic decision instances that are evaluated inside a process
   * with the given execution id. */
  HistoricDecisionInstanceQuery executionId(String executionId);

  /** Only select historic decision instances that are evaluated inside a process
   * with the given activity id. */
  HistoricDecisionInstanceQuery activityId(String activityId);

  /** Only select historic decision instances that are evaluated inside a process
   * with the given activity instance id. */
  HistoricDecisionInstanceQuery activityInstanceId(String activityInstanceId);

  /** Order by the time when the decisions was evaluated
   * (needs to be followed by {@link #asc()} or {@link #desc()}). */
  HistoricDecisionInstanceQuery orderByEvaluationTime();

  /** Enable fetch corresponding {@link HistoricDecisionInputInstance} of evaluated decision. */
  HistoricDecisionInstanceQuery includeInputs();

  /** Enable fetch corresponding {@link HistoricDecisionOutputInstance} of evaluated decision. */
  HistoricDecisionInstanceQuery includeOutputs();
}
